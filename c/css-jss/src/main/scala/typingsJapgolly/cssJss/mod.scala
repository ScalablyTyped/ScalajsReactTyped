package typingsJapgolly.cssJss

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.jss.mod.Jss
import typingsJapgolly.jss.mod.JssStyle
import typingsJapgolly.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("css-jss", JSImport.Default)
  @js.native
  val default: ReturnType[CreateCss] = js.native
  
  @JSImport("css-jss", "create")
  @js.native
  val create: CreateCss = js.native
  
  type CreateCss = js.Function1[/* jss */ js.UndefOr[Jss], Css]
  
  @js.native
  trait Css extends StObject {
    
    def apply(args: StyleArg*): String = js.native
  }
  
  type StyleArg = (JssStyle[Any, Unit]) | (js.Array[JssStyle[Any, Unit]])
  
  type _To = ReturnType[CreateCss]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: ReturnType[CreateCss] = default
}
