package typingsJapgolly.reactTypist.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactTypist.mod.Typist.CurrentTextProps
import typingsJapgolly.reactTypist.mod.Typist.CursorProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_TypistProps761552895[R <: js.Object] (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[R] {
  
  inline def avgTypingDelay(value: Double): this.type = set("avgTypingDelay", value.asInstanceOf[js.Any])
  
  inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  
  inline def cursor(value: CursorProps): this.type = set("cursor", value.asInstanceOf[js.Any])
  
  inline def delayGenerator(value: (/* mean */ Double, /* std */ Double, /* current */ CurrentTextProps) => Double): this.type = set("delayGenerator", js.Any.fromFunction3(value))
  
  inline def onCharacterTyped(value: (/* char */ String, /* charIndex */ Double) => Callback): this.type = set("onCharacterTyped", js.Any.fromFunction2((t0: /* char */ String, t1: /* charIndex */ Double) => (value(t0, t1)).runNow()))
  
  inline def onLineTyped(value: (/* line */ String, /* lineIndex */ Double) => Callback): this.type = set("onLineTyped", js.Any.fromFunction2((t0: /* line */ String, t1: /* lineIndex */ Double) => (value(t0, t1)).runNow()))
  
  inline def onTypingDone(value: Callback): this.type = set("onTypingDone", value.toJsFn)
  
  inline def startDelay(value: Double): this.type = set("startDelay", value.asInstanceOf[js.Any])
  
  inline def stdTypingDelay(value: Double): this.type = set("stdTypingDelay", value.asInstanceOf[js.Any])
}
