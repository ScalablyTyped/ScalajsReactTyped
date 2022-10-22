package typingsJapgolly.winrt.Windows.UI.Core

import typingsJapgolly.winrt.Windows.Foundation.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICoreWindowFlyoutFactory extends StObject {
  
  def create(position: Point): CoreWindowFlyout
  
  def createWithTitle(position: Point, title: String): CoreWindowFlyout
}
object ICoreWindowFlyoutFactory {
  
  inline def apply(create: Point => CoreWindowFlyout, createWithTitle: (Point, String) => CoreWindowFlyout): ICoreWindowFlyoutFactory = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), createWithTitle = js.Any.fromFunction2(createWithTitle))
    __obj.asInstanceOf[ICoreWindowFlyoutFactory]
  }
  
  extension [Self <: ICoreWindowFlyoutFactory](x: Self) {
    
    inline def setCreate(value: Point => CoreWindowFlyout): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
    
    inline def setCreateWithTitle(value: (Point, String) => CoreWindowFlyout): Self = StObject.set(x, "createWithTitle", js.Any.fromFunction2(value))
  }
}
