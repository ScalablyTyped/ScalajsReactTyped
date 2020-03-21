package typingsJapgolly.jupyterlabDocumentsearchExtension

import typingsJapgolly.jupyterlabApplication.frontendMod.JupyterFrontEnd.IShell
import typingsJapgolly.jupyterlabApplication.mod.JupyterFrontEnd
import typingsJapgolly.jupyterlabDocumentsearch.tokensMod.ISearchProviderRegistry
import typingsJapgolly.phosphorApplication.mod.IPlugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/documentsearch-extension", JSImport.Namespace)
@js.native
object mod extends js.Object {
  val default: js.Array[IPlugin[JupyterFrontEnd[IShell], ISearchProviderRegistry | Unit]] = js.native
}

