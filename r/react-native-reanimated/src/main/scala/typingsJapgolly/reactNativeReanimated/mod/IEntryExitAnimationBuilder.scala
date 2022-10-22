package typingsJapgolly.reactNativeReanimated.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IEntryExitAnimationBuilder extends StObject {
  
  def build(): EntryExitAnimationFunction
}
object IEntryExitAnimationBuilder {
  
  inline def apply(build: CallbackTo[EntryExitAnimationFunction]): IEntryExitAnimationBuilder = {
    val __obj = js.Dynamic.literal(build = build.toJsFn)
    __obj.asInstanceOf[IEntryExitAnimationBuilder]
  }
  
  extension [Self <: IEntryExitAnimationBuilder](x: Self) {
    
    inline def setBuild(value: CallbackTo[EntryExitAnimationFunction]): Self = StObject.set(x, "build", value.toJsFn)
  }
}
