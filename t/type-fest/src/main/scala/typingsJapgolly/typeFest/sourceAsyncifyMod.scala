package typingsJapgolly.typeFest

import typingsJapgolly.std.Awaited
import typingsJapgolly.std.ReturnType
import typingsJapgolly.typeFest.sourceSetReturnTypeMod.SetReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceAsyncifyMod {
  
  type Asyncify[Fn /* <: js.Function1[/* repeated */ Any, Any] */] = SetReturnType[Fn, js.Promise[Awaited[ReturnType[Fn]]]]
}
