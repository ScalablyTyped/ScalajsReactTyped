package typingsJapgolly.activexLibreoffice.com_.sun.star.inspection

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * grants access to certain aspects of the user interface of an object inspector
  *
  * This interface is used as callback for XPropertyHandlers.
  *
  * As a consequence, methods operating on the UI for a property, and taking the name of this property, are tolerant against properties which do not
  * exist. For instance, if a property handler tries to disable the UI for property `Foo` , but another handler has superseded this property, then the
  * {@link ObjectInspector} will not **have** any UI for it. In this case, the call to `enablePropertyUI( "Foo" )` will simply be ignored.
  * @since OOo 2.0.3
  */
trait XObjectInspectorUI extends StObject {
  
  /**
    * enables or disables all components belonging to the UI representation of a property
    *
    * This is usually used by an {@link XPropertyHandler} if it handles properties, where one does only make sense if another one has a certain value.
    * @param PropertyName denotes the name of the property whose UI is to be enabled or disabled.
    * @param Enable `TRUE` if and only if the UI should be disabled, `FALSE` otherwise.
    */
  def enablePropertyUI(PropertyName: String, Enable: Boolean): Unit
  
  /**
    * enables or disables the single elements which can be part of the UI representation of a property
    *
    * Note that the complete UI for the property must be enabled in order for these settings to be evaluated. That is, {@link enablePropertyUIElements()}
    * does not have any effect if somebody previously disabled the complete UI for this property with {@link enablePropertyUI()} .
    * @param PropertyName the name of the property whose user interface elements are to be enabled or disabled
    * @param Elements a combination of {@link PropertyLineElement} flags specifying which elements are to be enabled or disabled. ;  Note that if you don't se
    * @param Enable `TRUE` if the elements denoted by _nElements should be enabled, `FALSE` if they should be disabled.
    */
  def enablePropertyUIElements(PropertyName: String, Elements: Double, Enable: Boolean): Unit
  
  /**
    * retrieves the control currently used to display a given property
    * @param PropertyName the name of the property whose control should be retrieved
    * @returns the {@link XPropertyControl} representing the given property, or `NULL` if there is no such property control.
    */
  def getPropertyControl(PropertyName: String): XPropertyControl
  
  /**
    * hides the UI for a given property
    * @param PropertyName the name of the property whose UI is to be hidden
    */
  def hidePropertyUI(PropertyName: String): Unit
  
  /**
    * completely rebuilds the UI for the given property.
    *
    * This method might be used by an {@link XPropertyHandler} if it wants to change the type of control (see {@link PropertyControlType} ) used to display
    * a certain property.
    *
    * The object inspector will then call describePropertyLine again, and update its UI accordingly.
    *
    * Note that the property whose UI should be rebuilt must not necessarily be (though usually **is** ) in the responsibility of the handler which calls
    * this method. The object inspector will look up the handler with the responsibility for PropertyName and call its {@link
    * XPropertyHandler.describePropertyLine()}
    * @param PropertyName the name of the property whose UI is to be completely rebuilt.
    */
  def rebuildPropertyUI(PropertyName: String): Unit
  
  /**
    * registers an observer for all property controls
    *
    * The given {@link XPropertyControlObserver} will be notified of all changes in all property controls.
    * @see revokeControlObserver
    * @since OOo 2.2
    */
  def registerControlObserver(Observer: XPropertyControlObserver): Unit
  
  /**
    * revokes a previously registered control observer
    * @see registerControlObserver
    * @since OOo 2.2
    */
  def revokeControlObserver(Observer: XPropertyControlObserver): Unit
  
  /**
    * sets the text of the help section, if the object inspector contains one.
    * @since OOo 2.2
    * @throws NoSupportException if the {@link XObjectInspectorModel.HasHelpSection} property requires the help section to be unavailable.
    */
  def setHelpSectionText(HelpText: String): Unit
  
  /**
    * shows or hides all properties belonging to a given category
    * @see LineDescriptor.Category
    * @see XObjectInspectorModel.describeCategories
    */
  def showCategory(Category: String, Show: Boolean): Unit
  
  /**
    * shows the UI for a given property
    * @param PropertyName the name of the property whose UI is to be shown
    */
  def showPropertyUI(PropertyName: String): Unit
}
object XObjectInspectorUI {
  
  inline def apply(
    enablePropertyUI: (String, Boolean) => Callback,
    enablePropertyUIElements: (String, Double, Boolean) => Callback,
    getPropertyControl: String => XPropertyControl,
    hidePropertyUI: String => Callback,
    rebuildPropertyUI: String => Callback,
    registerControlObserver: XPropertyControlObserver => Callback,
    revokeControlObserver: XPropertyControlObserver => Callback,
    setHelpSectionText: String => Callback,
    showCategory: (String, Boolean) => Callback,
    showPropertyUI: String => Callback
  ): XObjectInspectorUI = {
    val __obj = js.Dynamic.literal(enablePropertyUI = js.Any.fromFunction2((t0: String, t1: Boolean) => (enablePropertyUI(t0, t1)).runNow()), enablePropertyUIElements = js.Any.fromFunction3((t0: String, t1: Double, t2: Boolean) => (enablePropertyUIElements(t0, t1, t2)).runNow()), getPropertyControl = js.Any.fromFunction1(getPropertyControl), hidePropertyUI = js.Any.fromFunction1((t0: String) => hidePropertyUI(t0).runNow()), rebuildPropertyUI = js.Any.fromFunction1((t0: String) => rebuildPropertyUI(t0).runNow()), registerControlObserver = js.Any.fromFunction1((t0: XPropertyControlObserver) => registerControlObserver(t0).runNow()), revokeControlObserver = js.Any.fromFunction1((t0: XPropertyControlObserver) => revokeControlObserver(t0).runNow()), setHelpSectionText = js.Any.fromFunction1((t0: String) => setHelpSectionText(t0).runNow()), showCategory = js.Any.fromFunction2((t0: String, t1: Boolean) => (showCategory(t0, t1)).runNow()), showPropertyUI = js.Any.fromFunction1((t0: String) => showPropertyUI(t0).runNow()))
    __obj.asInstanceOf[XObjectInspectorUI]
  }
  
  extension [Self <: XObjectInspectorUI](x: Self) {
    
    inline def setEnablePropertyUI(value: (String, Boolean) => Callback): Self = StObject.set(x, "enablePropertyUI", js.Any.fromFunction2((t0: String, t1: Boolean) => (value(t0, t1)).runNow()))
    
    inline def setEnablePropertyUIElements(value: (String, Double, Boolean) => Callback): Self = StObject.set(x, "enablePropertyUIElements", js.Any.fromFunction3((t0: String, t1: Double, t2: Boolean) => (value(t0, t1, t2)).runNow()))
    
    inline def setGetPropertyControl(value: String => XPropertyControl): Self = StObject.set(x, "getPropertyControl", js.Any.fromFunction1(value))
    
    inline def setHidePropertyUI(value: String => Callback): Self = StObject.set(x, "hidePropertyUI", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setRebuildPropertyUI(value: String => Callback): Self = StObject.set(x, "rebuildPropertyUI", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setRegisterControlObserver(value: XPropertyControlObserver => Callback): Self = StObject.set(x, "registerControlObserver", js.Any.fromFunction1((t0: XPropertyControlObserver) => value(t0).runNow()))
    
    inline def setRevokeControlObserver(value: XPropertyControlObserver => Callback): Self = StObject.set(x, "revokeControlObserver", js.Any.fromFunction1((t0: XPropertyControlObserver) => value(t0).runNow()))
    
    inline def setSetHelpSectionText(value: String => Callback): Self = StObject.set(x, "setHelpSectionText", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setShowCategory(value: (String, Boolean) => Callback): Self = StObject.set(x, "showCategory", js.Any.fromFunction2((t0: String, t1: Boolean) => (value(t0, t1)).runNow()))
    
    inline def setShowPropertyUI(value: String => Callback): Self = StObject.set(x, "showPropertyUI", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
