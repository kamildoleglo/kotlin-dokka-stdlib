package org.jetbrains.dokka.stdlibPlugin

import org.jetbrains.dokka.CoreExtensions
import org.jetbrains.dokka.base.DokkaBase
import org.jetbrains.dokka.plugability.DokkaPlugin
import org.jetbrains.dokka.stdlibPlugin.merger.StdlibDocumentableMerger

class DokkaStdlibPlugin : DokkaPlugin() {

    val merger by extending {
        CoreExtensions.documentableMerger providing ::StdlibDocumentableMerger override plugin<DokkaBase>().documentableMerger
    }
}
