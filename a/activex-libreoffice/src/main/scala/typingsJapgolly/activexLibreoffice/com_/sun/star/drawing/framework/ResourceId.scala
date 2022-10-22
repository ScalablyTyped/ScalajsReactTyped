package typingsJapgolly.activexLibreoffice.com_.sun.star.drawing.framework

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.URL
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The {@link ResourceId} service provides several constructors for resource ids.
  *
  * They mainly differ in how the anchor is specified.
  */
trait ResourceId
  extends StObject
     with XResourceId {
  
  /**
    * Create a resource id that has no anchor.
    *
    * This constructor can be used to create resource ids for panes.
    */
  def create(sResourceURL: String): Unit
  
  /** Create an empty resource id. It does not specify a specific resource but describes the absence of one. */
  def createEmpty(): Unit
  
  /** Create a resource id for an anchor that is given as {@link XResourceId} object. This is the most general of the constructor variants. */
  def createWithAnchor(sResourceURL: String, xAnchor: XResourceId): Unit
  
  /**
    * Create a resource id for a resource that is bound to an anchor that can be specified by a single URL.
    *
    * This constructor can be used to create resources ids for views where the anchor is a pane.
    */
  def createWithAnchorURL(sResourceURL: String, sAnchorURL: String): Unit
}
object ResourceId {
  
  inline def apply(
    Anchor: XResourceId,
    AnchorURLs: SafeArray[String],
    FullResourceURL: URL,
    ResourceTypePrefix: String,
    ResourceURL: String,
    compareTo: XResourceId => Double,
    create: String => Callback,
    createEmpty: Callback,
    createWithAnchor: (String, XResourceId) => Callback,
    createWithAnchorURL: (String, String) => Callback,
    getAnchor: CallbackTo[XResourceId],
    getAnchorURLs: CallbackTo[SafeArray[String]],
    getFullResourceURL: CallbackTo[URL],
    getResourceTypePrefix: CallbackTo[String],
    getResourceURL: CallbackTo[String],
    hasAnchor: CallbackTo[Boolean],
    isBoundTo: (XResourceId, AnchorBindingMode) => Boolean,
    isBoundToURL: (String, AnchorBindingMode) => Boolean
  ): ResourceId = {
    val __obj = js.Dynamic.literal(Anchor = Anchor.asInstanceOf[js.Any], AnchorURLs = AnchorURLs.asInstanceOf[js.Any], FullResourceURL = FullResourceURL.asInstanceOf[js.Any], ResourceTypePrefix = ResourceTypePrefix.asInstanceOf[js.Any], ResourceURL = ResourceURL.asInstanceOf[js.Any], compareTo = js.Any.fromFunction1(compareTo), create = js.Any.fromFunction1((t0: String) => create(t0).runNow()), createEmpty = createEmpty.toJsFn, createWithAnchor = js.Any.fromFunction2((t0: String, t1: XResourceId) => (createWithAnchor(t0, t1)).runNow()), createWithAnchorURL = js.Any.fromFunction2((t0: String, t1: String) => (createWithAnchorURL(t0, t1)).runNow()), getAnchor = getAnchor.toJsFn, getAnchorURLs = getAnchorURLs.toJsFn, getFullResourceURL = getFullResourceURL.toJsFn, getResourceTypePrefix = getResourceTypePrefix.toJsFn, getResourceURL = getResourceURL.toJsFn, hasAnchor = hasAnchor.toJsFn, isBoundTo = js.Any.fromFunction2(isBoundTo), isBoundToURL = js.Any.fromFunction2(isBoundToURL))
    __obj.asInstanceOf[ResourceId]
  }
  
  extension [Self <: ResourceId](x: Self) {
    
    inline def setCreate(value: String => Callback): Self = StObject.set(x, "create", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setCreateEmpty(value: Callback): Self = StObject.set(x, "createEmpty", value.toJsFn)
    
    inline def setCreateWithAnchor(value: (String, XResourceId) => Callback): Self = StObject.set(x, "createWithAnchor", js.Any.fromFunction2((t0: String, t1: XResourceId) => (value(t0, t1)).runNow()))
    
    inline def setCreateWithAnchorURL(value: (String, String) => Callback): Self = StObject.set(x, "createWithAnchorURL", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
  }
}
