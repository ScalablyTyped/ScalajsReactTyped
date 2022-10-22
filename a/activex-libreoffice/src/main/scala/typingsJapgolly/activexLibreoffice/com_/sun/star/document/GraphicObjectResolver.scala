package typingsJapgolly.activexLibreoffice.com_.sun.star.document

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.embed.XStorage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @since LibreOffice 4.1 */
trait GraphicObjectResolver
  extends StObject
     with XGraphicObjectResolver {
  
  def createWithStorage(Storage: XStorage): Unit
}
object GraphicObjectResolver {
  
  inline def apply(
    acquire: Callback,
    createWithStorage: XStorage => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    resolveGraphicObjectURL: String => String
  ): GraphicObjectResolver = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, createWithStorage = js.Any.fromFunction1((t0: XStorage) => createWithStorage(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, resolveGraphicObjectURL = js.Any.fromFunction1(resolveGraphicObjectURL))
    __obj.asInstanceOf[GraphicObjectResolver]
  }
  
  extension [Self <: GraphicObjectResolver](x: Self) {
    
    inline def setCreateWithStorage(value: XStorage => Callback): Self = StObject.set(x, "createWithStorage", js.Any.fromFunction1((t0: XStorage) => value(t0).runNow()))
  }
}
