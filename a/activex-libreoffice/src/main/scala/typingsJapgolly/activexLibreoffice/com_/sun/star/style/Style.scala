package typingsJapgolly.activexLibreoffice.com_.sun.star.style

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.NamedValue
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.PropertyState
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XMultiPropertySet
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XMultiPropertyStates
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertiesChangeListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XNameContainer
import typingsJapgolly.activexLibreoffice.com_.sun.star.xml.UserDefinedAttributesSupplier
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This service specifies a single style sheet. */
trait Style
  extends StObject
     with UserDefinedAttributesSupplier
     with XStyle
     with XPropertySet
     with XMultiPropertySet
     with XMultiPropertyStates {
  
  /**
    * contains the name of the style as it is displayed in the user interface.
    *
    * The names of the styles at the API are language independent. The user interface names are localized.
    */
  var DisplayName: String
  
  /**
    * contains the name of the style that is applied to the next paragraph.
    *
    * This property is usually available at paragraph styles only.
    */
  var FollowStyle: String
  
  /**
    * Flag indicating whether to hide the style in the UI.
    * @since LibreOffice 4.0
    */
  var Hidden: Boolean
  
  /**
    * determines if a style is automatically updated, if the properties of an object that the style is applied to are changed.
    *
    * For example, if the style is applied to a paragraph and the properties of the paragraph are changed then the style will be updated accordingly.
    */
  var IsAutoUpdate: String
  
  /**
    * determines if a style is physically created.
    *
    * Built in styles may not be created until they are needed. To prevent standard style properties from being exported, it may be useful to check if the
    * style is created first.
    */
  var IsPhysical: Boolean
  
  /**
    * defines the context and styles for conditional paragraphs.
    *
    * This property is only available if the style is a conditional paragraph style.
    *
    * The sequence consists of pairs where the name part of the pair defines the context where it should be applied and the value part is a string naming
    * the style to be used in that context.
    *
    * Assigning an empty string to the style name will disable the conditional style for that context.
    *
    * The allowed strings (contexts) for the name part of an entry of the sequence are:
    *
    * umberingLevel1NumberingLevel2NumberingLevel3NumberingLevel4NumberingLevel5NumberingLevel6NumberingLevel7NumberingLevel8NumberingLevel9NumberingLevel10
    * @since OOo 2.0.1
    */
  var ParaStyleConditions: SafeArray[NamedValue]
  
  /**
    * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object to which this interface belongs. NULL is returned if the obj
    * @see XPropertySet.getPropertySetInfo
    */
  /* InferMemberOverrides */
  override val PropertySetInfo: XPropertySetInfo
  
  /**
    * Grab bag of style properties, used as a string-any map for interim interop purposes.
    * @since LibreOffice 4.2  This property is intentionally not handled by the ODF filter. Any member that should be handled there should be first moved out
    */
  var StyleInteropGrabBag: SafeArray[PropertyValue]
  
  /**
    * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object which supplies this interface.
    * @returns NULL if the implementation cannot or will not provide information about the properties; otherwise the interface {@link XPropertySetInfo} is returned.
    */
  /* InferMemberOverrides */
  override def getPropertySetInfo(): XPropertySetInfo
}
object Style {
  
  inline def apply(
    DisplayName: String,
    FollowStyle: String,
    Hidden: Boolean,
    IsAutoUpdate: String,
    IsPhysical: Boolean,
    Name: String,
    ParaStyleConditions: SafeArray[NamedValue],
    ParentStyle: String,
    PropertySetInfo: XPropertySetInfo,
    StyleInteropGrabBag: SafeArray[PropertyValue],
    UserDefinedAttributes: XNameContainer,
    acquire: Callback,
    addPropertiesChangeListener: (SeqEquiv[String], XPropertiesChangeListener) => Callback,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Callback,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Callback,
    firePropertiesChangeEvent: (SeqEquiv[String], XPropertiesChangeListener) => Callback,
    getName: CallbackTo[String],
    getParentStyle: CallbackTo[String],
    getPropertyDefaults: SeqEquiv[String] => SafeArray[Any],
    getPropertySetInfo: CallbackTo[XPropertySetInfo],
    getPropertyStates: SeqEquiv[String] => SafeArray[PropertyState],
    getPropertyValue: String => Any,
    getPropertyValues: SeqEquiv[String] => SafeArray[Any],
    isInUse: CallbackTo[Boolean],
    isUserDefined: CallbackTo[Boolean],
    queryInterface: `type` => Any,
    release: Callback,
    removePropertiesChangeListener: XPropertiesChangeListener => Callback,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Callback,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Callback,
    setAllPropertiesToDefault: Callback,
    setName: String => Callback,
    setParentStyle: String => Callback,
    setPropertiesToDefault: SeqEquiv[String] => Callback,
    setPropertyValue: (String, Any) => Callback,
    setPropertyValues: (SeqEquiv[String], SeqEquiv[Any]) => Callback
  ): Style = {
    val __obj = js.Dynamic.literal(DisplayName = DisplayName.asInstanceOf[js.Any], FollowStyle = FollowStyle.asInstanceOf[js.Any], Hidden = Hidden.asInstanceOf[js.Any], IsAutoUpdate = IsAutoUpdate.asInstanceOf[js.Any], IsPhysical = IsPhysical.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], ParaStyleConditions = ParaStyleConditions.asInstanceOf[js.Any], ParentStyle = ParentStyle.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], StyleInteropGrabBag = StyleInteropGrabBag.asInstanceOf[js.Any], UserDefinedAttributes = UserDefinedAttributes.asInstanceOf[js.Any], acquire = acquire.toJsFn, addPropertiesChangeListener = js.Any.fromFunction2((t0: SeqEquiv[String], t1: XPropertiesChangeListener) => (addPropertiesChangeListener(t0, t1)).runNow()), addPropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (addPropertyChangeListener(t0, t1)).runNow()), addVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (addVetoableChangeListener(t0, t1)).runNow()), firePropertiesChangeEvent = js.Any.fromFunction2((t0: SeqEquiv[String], t1: XPropertiesChangeListener) => (firePropertiesChangeEvent(t0, t1)).runNow()), getName = getName.toJsFn, getParentStyle = getParentStyle.toJsFn, getPropertyDefaults = js.Any.fromFunction1(getPropertyDefaults), getPropertySetInfo = getPropertySetInfo.toJsFn, getPropertyStates = js.Any.fromFunction1(getPropertyStates), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getPropertyValues = js.Any.fromFunction1(getPropertyValues), isInUse = isInUse.toJsFn, isUserDefined = isUserDefined.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removePropertiesChangeListener = js.Any.fromFunction1((t0: XPropertiesChangeListener) => removePropertiesChangeListener(t0).runNow()), removePropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (removePropertyChangeListener(t0, t1)).runNow()), removeVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (removeVetoableChangeListener(t0, t1)).runNow()), setAllPropertiesToDefault = setAllPropertiesToDefault.toJsFn, setName = js.Any.fromFunction1((t0: String) => setName(t0).runNow()), setParentStyle = js.Any.fromFunction1((t0: String) => setParentStyle(t0).runNow()), setPropertiesToDefault = js.Any.fromFunction1((t0: SeqEquiv[String]) => setPropertiesToDefault(t0).runNow()), setPropertyValue = js.Any.fromFunction2((t0: String, t1: Any) => (setPropertyValue(t0, t1)).runNow()), setPropertyValues = js.Any.fromFunction2((t0: SeqEquiv[String], t1: SeqEquiv[Any]) => (setPropertyValues(t0, t1)).runNow()))
    __obj.asInstanceOf[Style]
  }
  
  extension [Self <: Style](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "DisplayName", value.asInstanceOf[js.Any])
    
    inline def setFollowStyle(value: String): Self = StObject.set(x, "FollowStyle", value.asInstanceOf[js.Any])
    
    inline def setGetPropertySetInfo(value: CallbackTo[XPropertySetInfo]): Self = StObject.set(x, "getPropertySetInfo", value.toJsFn)
    
    inline def setHidden(value: Boolean): Self = StObject.set(x, "Hidden", value.asInstanceOf[js.Any])
    
    inline def setIsAutoUpdate(value: String): Self = StObject.set(x, "IsAutoUpdate", value.asInstanceOf[js.Any])
    
    inline def setIsPhysical(value: Boolean): Self = StObject.set(x, "IsPhysical", value.asInstanceOf[js.Any])
    
    inline def setParaStyleConditions(value: SafeArray[NamedValue]): Self = StObject.set(x, "ParaStyleConditions", value.asInstanceOf[js.Any])
    
    inline def setPropertySetInfo(value: XPropertySetInfo): Self = StObject.set(x, "PropertySetInfo", value.asInstanceOf[js.Any])
    
    inline def setStyleInteropGrabBag(value: SafeArray[PropertyValue]): Self = StObject.set(x, "StyleInteropGrabBag", value.asInstanceOf[js.Any])
  }
}
