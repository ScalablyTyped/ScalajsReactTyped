package typingsJapgolly.activexLibreoffice.com_.sun.star.drawing

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.Point
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.Size
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.GetDirectPropertyTolerantResult
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.GetPropertyTolerantResult
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.SetPropertyTolerantFailed
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XTolerantMultiPropertySet
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XIndexContainer
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XNameContainer
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XComponent
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.style.XStyle
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This abstract service specifies the general characteristics of all {@link Shapes} .
  * @see XShape
  * @see com.sun.star.lang.XComponent
  * @see com.sun.star.text.XText
  * @see ShapeDescriptor
  */
trait Shape
  extends StObject
     with XPropertySet
     with XShape
     with XComponent
     with XGluePointsSupplier
     with XTolerantMultiPropertySet {
  
  /** this property lets you get and set a hyperlink for this shape. */
  var Hyperlink: String
  
  /**
    * Grab bag of shape properties, used as a string-any map for interim interop purposes.
    * @since LibreOffice 4.2  This property is intentionally not handled by the ODF filter. Any member that should be handled there should be first moved out
    */
  var InteropGrabBag: SafeArray[PropertyValue]
  
  /** This is the ID of the {@link Layer} to which this {@link Shape} is attached. */
  var LayerID: Double
  
  /** This is the name of the {@link Layer} to which this {@link Shape} is attached. */
  var LayerName: String
  
  /** With this set to `TRUE` , this {@link Shape} cannot be moved interactively in the user interface. */
  var MoveProtect: Boolean
  
  /** This is the name of this {@link Shape} . */
  var Name: String
  
  /** this property stores the navigation order of this shape. If this value is negative, the navigation order for this shapes page is equal to the z-order. */
  var NavigationOrder: Double
  
  /** If this is `FALSE` , the {@link Shape} is not visible on printer outputs. */
  var Printable: Boolean
  
  /**
    * contains the relative height of the object.
    *
    * It is only valid if it is greater than zero.
    * @since LibreOffice 4.3
    */
  var RelativeHeight: Double
  
  /**
    * contains the relation of the relative height of the object.
    *
    * It is only valid if RelativeHeight is greater than zero.
    * @see com.sun.star.text.RelOrientation
    * @since LibreOffice 4.3
    */
  var RelativeHeightRelation: Double
  
  /**
    * contains the relative width of the object.
    *
    * It is only valid if it is greater than zero.
    * @since LibreOffice 4.3
    */
  var RelativeWidth: Double
  
  /**
    * contains the relation of the relative width of the object.
    *
    * It is only valid if RelativeWidth is greater than zero.
    * @see com.sun.star.text.RelOrientation
    * @since LibreOffice 4.3
    */
  var RelativeWidthRelation: Double
  
  /**
    * this property stores xml attributes. They will be saved to and restored from automatic styles inside xml files.
    * @see com.sun.star.xml.AttributeContainer
    */
  var ShapeUserDefinedAttributes: XNameContainer
  
  /** With this set to `TRUE` , this {@link Shape} may not be sized interactively in the user interface. */
  var SizeProtect: Boolean
  
  /** this property lets you get and set a style for this shape. */
  var Style: XStyle
  
  /**
    * this property lets you get and set the transformation matrix for this shape.
    *
    * The transformation is a 3x3 homogeneous matrix and can contain translation, rotation, shearing and scaling.
    */
  var Transformation: HomogenMatrix3
  
  /**
    * If this is `FALSE` , the {@link Shape} is not visible on screen outputs. Please note that the {@link Shape} may still be visible when printed, see
    * {@link Printable} .
    */
  var Visible: Boolean
  
  /** is used to query or change the ZOrder of this {@link Shape} . */
  var ZOrder: Double
}
object Shape {
  
  inline def apply(
    GluePoints: XIndexContainer,
    Hyperlink: String,
    InteropGrabBag: SafeArray[PropertyValue],
    LayerID: Double,
    LayerName: String,
    MoveProtect: Boolean,
    Name: String,
    NavigationOrder: Double,
    Position: Point,
    Printable: Boolean,
    PropertySetInfo: XPropertySetInfo,
    RelativeHeight: Double,
    RelativeHeightRelation: Double,
    RelativeWidth: Double,
    RelativeWidthRelation: Double,
    ShapeType: String,
    ShapeUserDefinedAttributes: XNameContainer,
    Size: Size,
    SizeProtect: Boolean,
    Style: XStyle,
    Transformation: HomogenMatrix3,
    Visible: Boolean,
    ZOrder: Double,
    acquire: Callback,
    addEventListener: XEventListener => Callback,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Callback,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Callback,
    dispose: Callback,
    getDirectPropertyValuesTolerant: SeqEquiv[String] => SafeArray[GetDirectPropertyTolerantResult],
    getGluePoints: CallbackTo[XIndexContainer],
    getPosition: CallbackTo[Point],
    getPropertySetInfo: CallbackTo[XPropertySetInfo],
    getPropertyValue: String => Any,
    getPropertyValuesTolerant: SeqEquiv[String] => SafeArray[GetPropertyTolerantResult],
    getShapeType: CallbackTo[String],
    getSize: CallbackTo[Size],
    queryInterface: `type` => Any,
    release: Callback,
    removeEventListener: XEventListener => Callback,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Callback,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Callback,
    setPosition: Point => Callback,
    setPropertyValue: (String, Any) => Callback,
    setPropertyValuesTolerant: (SeqEquiv[String], SeqEquiv[Any]) => SafeArray[SetPropertyTolerantFailed],
    setSize: Size => Callback
  ): Shape = {
    val __obj = js.Dynamic.literal(GluePoints = GluePoints.asInstanceOf[js.Any], Hyperlink = Hyperlink.asInstanceOf[js.Any], InteropGrabBag = InteropGrabBag.asInstanceOf[js.Any], LayerID = LayerID.asInstanceOf[js.Any], LayerName = LayerName.asInstanceOf[js.Any], MoveProtect = MoveProtect.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], NavigationOrder = NavigationOrder.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any], Printable = Printable.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], RelativeHeight = RelativeHeight.asInstanceOf[js.Any], RelativeHeightRelation = RelativeHeightRelation.asInstanceOf[js.Any], RelativeWidth = RelativeWidth.asInstanceOf[js.Any], RelativeWidthRelation = RelativeWidthRelation.asInstanceOf[js.Any], ShapeType = ShapeType.asInstanceOf[js.Any], ShapeUserDefinedAttributes = ShapeUserDefinedAttributes.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], SizeProtect = SizeProtect.asInstanceOf[js.Any], Style = Style.asInstanceOf[js.Any], Transformation = Transformation.asInstanceOf[js.Any], Visible = Visible.asInstanceOf[js.Any], ZOrder = ZOrder.asInstanceOf[js.Any], acquire = acquire.toJsFn, addEventListener = js.Any.fromFunction1((t0: XEventListener) => addEventListener(t0).runNow()), addPropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (addPropertyChangeListener(t0, t1)).runNow()), addVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (addVetoableChangeListener(t0, t1)).runNow()), dispose = dispose.toJsFn, getDirectPropertyValuesTolerant = js.Any.fromFunction1(getDirectPropertyValuesTolerant), getGluePoints = getGluePoints.toJsFn, getPosition = getPosition.toJsFn, getPropertySetInfo = getPropertySetInfo.toJsFn, getPropertyValue = js.Any.fromFunction1(getPropertyValue), getPropertyValuesTolerant = js.Any.fromFunction1(getPropertyValuesTolerant), getShapeType = getShapeType.toJsFn, getSize = getSize.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeEventListener = js.Any.fromFunction1((t0: XEventListener) => removeEventListener(t0).runNow()), removePropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (removePropertyChangeListener(t0, t1)).runNow()), removeVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (removeVetoableChangeListener(t0, t1)).runNow()), setPosition = js.Any.fromFunction1((t0: Point) => setPosition(t0).runNow()), setPropertyValue = js.Any.fromFunction2((t0: String, t1: Any) => (setPropertyValue(t0, t1)).runNow()), setPropertyValuesTolerant = js.Any.fromFunction2(setPropertyValuesTolerant), setSize = js.Any.fromFunction1((t0: Size) => setSize(t0).runNow()))
    __obj.asInstanceOf[Shape]
  }
  
  extension [Self <: Shape](x: Self) {
    
    inline def setHyperlink(value: String): Self = StObject.set(x, "Hyperlink", value.asInstanceOf[js.Any])
    
    inline def setInteropGrabBag(value: SafeArray[PropertyValue]): Self = StObject.set(x, "InteropGrabBag", value.asInstanceOf[js.Any])
    
    inline def setLayerID(value: Double): Self = StObject.set(x, "LayerID", value.asInstanceOf[js.Any])
    
    inline def setLayerName(value: String): Self = StObject.set(x, "LayerName", value.asInstanceOf[js.Any])
    
    inline def setMoveProtect(value: Boolean): Self = StObject.set(x, "MoveProtect", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNavigationOrder(value: Double): Self = StObject.set(x, "NavigationOrder", value.asInstanceOf[js.Any])
    
    inline def setPrintable(value: Boolean): Self = StObject.set(x, "Printable", value.asInstanceOf[js.Any])
    
    inline def setRelativeHeight(value: Double): Self = StObject.set(x, "RelativeHeight", value.asInstanceOf[js.Any])
    
    inline def setRelativeHeightRelation(value: Double): Self = StObject.set(x, "RelativeHeightRelation", value.asInstanceOf[js.Any])
    
    inline def setRelativeWidth(value: Double): Self = StObject.set(x, "RelativeWidth", value.asInstanceOf[js.Any])
    
    inline def setRelativeWidthRelation(value: Double): Self = StObject.set(x, "RelativeWidthRelation", value.asInstanceOf[js.Any])
    
    inline def setShapeUserDefinedAttributes(value: XNameContainer): Self = StObject.set(x, "ShapeUserDefinedAttributes", value.asInstanceOf[js.Any])
    
    inline def setSizeProtect(value: Boolean): Self = StObject.set(x, "SizeProtect", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: XStyle): Self = StObject.set(x, "Style", value.asInstanceOf[js.Any])
    
    inline def setTransformation(value: HomogenMatrix3): Self = StObject.set(x, "Transformation", value.asInstanceOf[js.Any])
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "Visible", value.asInstanceOf[js.Any])
    
    inline def setZOrder(value: Double): Self = StObject.set(x, "ZOrder", value.asInstanceOf[js.Any])
  }
}
