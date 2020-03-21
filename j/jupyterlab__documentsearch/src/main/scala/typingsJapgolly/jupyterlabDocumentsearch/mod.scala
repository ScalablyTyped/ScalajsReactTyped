package typingsJapgolly.jupyterlabDocumentsearch

import typingsJapgolly.jupyterlabDocumentsearch.interfacesMod.ISearchProvider
import typingsJapgolly.phosphorCoreutils.mod.Token
import typingsJapgolly.phosphorWidgets.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/documentsearch", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class CodeMirrorSearchProvider ()
    extends typingsJapgolly.jupyterlabDocumentsearch.codemirrorsearchproviderMod.CodeMirrorSearchProvider
  
  @js.native
  class NotebookSearchProvider ()
    extends typingsJapgolly.jupyterlabDocumentsearch.notebooksearchproviderMod.NotebookSearchProvider
  
  @js.native
  class SearchInstance protected ()
    extends typingsJapgolly.jupyterlabDocumentsearch.searchinstanceMod.SearchInstance {
    def this(widget: Widget, searchProvider: ISearchProvider[Widget]) = this()
  }
  
  @js.native
  class SearchProviderRegistry ()
    extends typingsJapgolly.jupyterlabDocumentsearch.searchproviderregistryMod.SearchProviderRegistry
  
  @js.native
  class SearchState ()
    extends typingsJapgolly.jupyterlabDocumentsearch.codemirrorsearchproviderMod.SearchState
  
  val ISearchProviderRegistry: Token[typingsJapgolly.jupyterlabDocumentsearch.tokensMod.ISearchProviderRegistry] = js.native
  /* static members */
  @js.native
  object CodeMirrorSearchProvider extends js.Object {
    /**
      * Report whether or not this provider has the ability to search on the given object
      */
    def canSearchOn(domain: Widget): /* is @jupyterlab/documentsearch.@jupyterlab/documentsearch/lib/providers/codemirrorsearchprovider.CMMainAreaWidget */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object NotebookSearchProvider extends js.Object {
    /**
      * Report whether or not this provider has the ability to search on the given object
      */
    def canSearchOn(domain: Widget): /* is @jupyterlab/notebook.@jupyterlab/notebook.NotebookPanel */ Boolean = js.native
  }
  
}

