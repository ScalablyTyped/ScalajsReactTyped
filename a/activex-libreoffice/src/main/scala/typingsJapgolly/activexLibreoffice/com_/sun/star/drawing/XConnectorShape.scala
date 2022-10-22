package typingsJapgolly.activexLibreoffice.com_.sun.star.drawing

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.Point
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.Size
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @deprecated Deprecated */
trait XConnectorShape
  extends StObject
     with XShape {
  
  /** connects the end of this instance. */
  def connectEnd(xShape: XConnectableShape, nPos: ConnectionType): Unit
  
  /** connects the start of this instance */
  def connectStart(xShape: XConnectableShape, nPos: ConnectionType): Unit
  
  /** disconnects the given {@link Shape} from the start of this instance. */
  def disconnectBegin(xShape: XConnectableShape): Unit
  
  /** disconnects the given {@link Shape} from the end of this instance. */
  def disconnectEnd(xShape: XConnectableShape): Unit
}
object XConnectorShape {
  
  inline def apply(
    Position: Point,
    ShapeType: String,
    Size: Size,
    acquire: Callback,
    connectEnd: (XConnectableShape, ConnectionType) => Callback,
    connectStart: (XConnectableShape, ConnectionType) => Callback,
    disconnectBegin: XConnectableShape => Callback,
    disconnectEnd: XConnectableShape => Callback,
    getPosition: CallbackTo[Point],
    getShapeType: CallbackTo[String],
    getSize: CallbackTo[Size],
    queryInterface: `type` => Any,
    release: Callback,
    setPosition: Point => Callback,
    setSize: Size => Callback
  ): XConnectorShape = {
    val __obj = js.Dynamic.literal(Position = Position.asInstanceOf[js.Any], ShapeType = ShapeType.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], acquire = acquire.toJsFn, connectEnd = js.Any.fromFunction2((t0: XConnectableShape, t1: ConnectionType) => (connectEnd(t0, t1)).runNow()), connectStart = js.Any.fromFunction2((t0: XConnectableShape, t1: ConnectionType) => (connectStart(t0, t1)).runNow()), disconnectBegin = js.Any.fromFunction1((t0: XConnectableShape) => disconnectBegin(t0).runNow()), disconnectEnd = js.Any.fromFunction1((t0: XConnectableShape) => disconnectEnd(t0).runNow()), getPosition = getPosition.toJsFn, getShapeType = getShapeType.toJsFn, getSize = getSize.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setPosition = js.Any.fromFunction1((t0: Point) => setPosition(t0).runNow()), setSize = js.Any.fromFunction1((t0: Size) => setSize(t0).runNow()))
    __obj.asInstanceOf[XConnectorShape]
  }
  
  extension [Self <: XConnectorShape](x: Self) {
    
    inline def setConnectEnd(value: (XConnectableShape, ConnectionType) => Callback): Self = StObject.set(x, "connectEnd", js.Any.fromFunction2((t0: XConnectableShape, t1: ConnectionType) => (value(t0, t1)).runNow()))
    
    inline def setConnectStart(value: (XConnectableShape, ConnectionType) => Callback): Self = StObject.set(x, "connectStart", js.Any.fromFunction2((t0: XConnectableShape, t1: ConnectionType) => (value(t0, t1)).runNow()))
    
    inline def setDisconnectBegin(value: XConnectableShape => Callback): Self = StObject.set(x, "disconnectBegin", js.Any.fromFunction1((t0: XConnectableShape) => value(t0).runNow()))
    
    inline def setDisconnectEnd(value: XConnectableShape => Callback): Self = StObject.set(x, "disconnectEnd", js.Any.fromFunction1((t0: XConnectableShape) => value(t0).runNow()))
  }
}
