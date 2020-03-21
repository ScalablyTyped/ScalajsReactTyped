package typingsJapgolly.jupyterlabExtensionmanager

import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.jupyterlabExtensionmanager.modelMod.IEntry
import typingsJapgolly.jupyterlabExtensionmanager.widgetMod.CollapsibleSection.IProperties
import typingsJapgolly.jupyterlabServices.mod.ServiceManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/extensionmanager", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class CollapsibleSection protected ()
    extends typingsJapgolly.jupyterlabExtensionmanager.widgetMod.CollapsibleSection {
    def this(props: IProperties) = this()
  }
  
  @js.native
  class ExtensionView protected ()
    extends typingsJapgolly.jupyterlabExtensionmanager.widgetMod.ExtensionView {
    def this(serviceManager: ServiceManager) = this()
  }
  
  @js.native
  class ListModel protected ()
    extends typingsJapgolly.jupyterlabExtensionmanager.modelMod.ListModel {
    def this(serviceManager: ServiceManager) = this()
  }
  
  @js.native
  class SearchBar protected ()
    extends typingsJapgolly.jupyterlabExtensionmanager.widgetMod.SearchBar {
    def this(props: typingsJapgolly.jupyterlabExtensionmanager.widgetMod.SearchBar.IProperties) = this()
  }
  
  @js.native
  /**
    * Create a Searcher object.
    *
    * @param repoUri The URI of the NPM registry to use.
    * @param cdnUri The URI of the CDN to use for fetching full package data.
    */
  class Searcher ()
    extends typingsJapgolly.jupyterlabExtensionmanager.queryMod.Searcher {
    def this(repoUri: String) = this()
    def this(repoUri: String, cdnUri: String) = this()
  }
  
  def isJupyterOrg(name: String): Boolean = js.native
  @js.native
  object ListModel extends js.Object {
    /**
      * Utility function to check whether an entry can be updated.
      *
      * @param entry The entry to check.
      */
    def entryHasUpdate(entry: IEntry): Boolean = js.native
  }
  
  @js.native
  object ListView extends js.Object {
    def apply(props: typingsJapgolly.jupyterlabExtensionmanager.widgetMod.ListView.IProperties): Element = js.native
  }
  
}

