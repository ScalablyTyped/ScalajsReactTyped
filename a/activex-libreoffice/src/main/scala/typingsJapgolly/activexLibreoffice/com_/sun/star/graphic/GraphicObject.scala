package typingsJapgolly.activexLibreoffice.com_.sun.star.graphic

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The `GraphicObject` service can be used to create {@link XGraphicObject} instances.
  *
  * {@link XGraphicObject} objects are accessible using {@link GraphicObject} scheme URLs like
  * `vnd.sun.star.GraphicObject:10000000000001940000012FB99807BD` . As long as at least one instance of {@link XGraphicObject} with a particular UniqueID
  * exists, the associated image/graphic is available.
  * @see GraphicObject
  * @see GraphicProvider
  * @see MediaProperties
  */
trait GraphicObject
  extends StObject
     with XGraphicObject {
  
  /** Creates an {@link GraphicObject} */
  def create(): Unit
  
  /**
    * Creates an {@link GraphicObject} with `uniqueId`
    * @param uniqueId If another {@link XGraphicObject} with `uniqueId` exists, this {@link GraphicObject} is populated with the other {@link GraphicObject} '
    */
  def createWithId(uniqueId: String): Unit
}
object GraphicObject {
  
  inline def apply(
    Graphic: XGraphic,
    UniqueID: String,
    acquire: Callback,
    create: Callback,
    createWithId: String => Callback,
    queryInterface: `type` => Any,
    release: Callback
  ): GraphicObject = {
    val __obj = js.Dynamic.literal(Graphic = Graphic.asInstanceOf[js.Any], UniqueID = UniqueID.asInstanceOf[js.Any], acquire = acquire.toJsFn, create = create.toJsFn, createWithId = js.Any.fromFunction1((t0: String) => createWithId(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[GraphicObject]
  }
  
  extension [Self <: GraphicObject](x: Self) {
    
    inline def setCreate(value: Callback): Self = StObject.set(x, "create", value.toJsFn)
    
    inline def setCreateWithId(value: String => Callback): Self = StObject.set(x, "createWithId", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
