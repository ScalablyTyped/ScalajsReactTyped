package typingsJapgolly.chrome.anon

import typingsJapgolly.chrome.chrome.scripting.Awaited
import typingsJapgolly.chrome.chrome.scripting.CSSInjection
import typingsJapgolly.chrome.chrome.scripting.InjectionResult
import typingsJapgolly.chrome.chrome.scripting.ScriptInjection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofscripting extends StObject {
  
  def executeScript[Args /* <: js.Array[Any] */, Result](injection: ScriptInjection[Args, Result]): js.Promise[js.Array[InjectionResult[Awaited[Result]]]] = js.native
  def executeScript[Args /* <: js.Array[Any] */, Result](
    injection: ScriptInjection[Args, Result],
    callback: js.Function1[/* results */ js.Array[InjectionResult[Awaited[Result]]], Unit]
  ): Unit = js.native
  @JSName("executeScript")
  def executeScript_ArgsResult_Unit[Args /* <: js.Array[Any] */, Result](injection: ScriptInjection[Args, Result]): Unit = js.native
  
  def insertCSS(injection: CSSInjection): Unit = js.native
  def insertCSS(injection: CSSInjection, callback: js.Function0[Unit]): Unit = js.native
  @JSName("insertCSS")
  def insertCSS_Promise(injection: CSSInjection): js.Promise[Unit] = js.native
  
  def removeCSS(injection: CSSInjection): Unit = js.native
  def removeCSS(injection: CSSInjection, callback: js.Function0[Unit]): Unit = js.native
  @JSName("removeCSS")
  def removeCSS_Promise(injection: CSSInjection): js.Promise[Unit] = js.native
}
