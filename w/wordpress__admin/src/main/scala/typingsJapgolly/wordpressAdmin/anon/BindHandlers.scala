package typingsJapgolly.wordpressAdmin.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BindHandlers extends StObject {
  
  /**
    * Bind region mode event callbacks.
    */
  def bindHandlers(): Unit
  
  // RouterView => media.view.Router
  /**
    * Render callback for the content region in the `browse` mode.
    */
  def browseContent(contentRegion: typingsJapgolly.wordpressAdmin.componentsMediaViewsMod.Region): Unit
  
  /**
    * Render callback for the router region in the `browse` mode.
    */
  def browseRouter(routerView: Any): Unit
  
  def createSelectToolbar(toolbar: Any, option: Any): Unit
  
  /**
    * Attach a selection collection to the frame.
    *
    * A selection is a collection of attachments used for a specific purpose
    * by a media frame. e.g. Selecting an attachment (or many) to insert into
    * post content.
    */
  def createSelection(): Unit
  
  /**
    * Create the default states on the frame.
    */
  def createStates(): Unit
  
  def editImageContent(): Unit
  
  def initialize(): Unit
  
  /**
    * Render callback for the content region in the `upload` mode.
    */
  def uploadContent(): Unit
}
object BindHandlers {
  
  inline def apply(
    bindHandlers: Callback,
    browseContent: typingsJapgolly.wordpressAdmin.componentsMediaViewsMod.Region => Callback,
    browseRouter: Any => Callback,
    createSelectToolbar: (Any, Any) => Callback,
    createSelection: Callback,
    createStates: Callback,
    editImageContent: Callback,
    initialize: Callback,
    uploadContent: Callback
  ): BindHandlers = {
    val __obj = js.Dynamic.literal(bindHandlers = bindHandlers.toJsFn, browseContent = js.Any.fromFunction1((t0: typingsJapgolly.wordpressAdmin.componentsMediaViewsMod.Region) => browseContent(t0).runNow()), browseRouter = js.Any.fromFunction1((t0: Any) => browseRouter(t0).runNow()), createSelectToolbar = js.Any.fromFunction2((t0: Any, t1: Any) => (createSelectToolbar(t0, t1)).runNow()), createSelection = createSelection.toJsFn, createStates = createStates.toJsFn, editImageContent = editImageContent.toJsFn, initialize = initialize.toJsFn, uploadContent = uploadContent.toJsFn)
    __obj.asInstanceOf[BindHandlers]
  }
  
  extension [Self <: BindHandlers](x: Self) {
    
    inline def setBindHandlers(value: Callback): Self = StObject.set(x, "bindHandlers", value.toJsFn)
    
    inline def setBrowseContent(value: typingsJapgolly.wordpressAdmin.componentsMediaViewsMod.Region => Callback): Self = StObject.set(x, "browseContent", js.Any.fromFunction1((t0: typingsJapgolly.wordpressAdmin.componentsMediaViewsMod.Region) => value(t0).runNow()))
    
    inline def setBrowseRouter(value: Any => Callback): Self = StObject.set(x, "browseRouter", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setCreateSelectToolbar(value: (Any, Any) => Callback): Self = StObject.set(x, "createSelectToolbar", js.Any.fromFunction2((t0: Any, t1: Any) => (value(t0, t1)).runNow()))
    
    inline def setCreateSelection(value: Callback): Self = StObject.set(x, "createSelection", value.toJsFn)
    
    inline def setCreateStates(value: Callback): Self = StObject.set(x, "createStates", value.toJsFn)
    
    inline def setEditImageContent(value: Callback): Self = StObject.set(x, "editImageContent", value.toJsFn)
    
    inline def setInitialize(value: Callback): Self = StObject.set(x, "initialize", value.toJsFn)
    
    inline def setUploadContent(value: Callback): Self = StObject.set(x, "uploadContent", value.toJsFn)
  }
}
