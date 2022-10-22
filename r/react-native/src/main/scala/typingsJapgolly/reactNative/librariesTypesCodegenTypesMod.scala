package typingsJapgolly.reactNative

import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.Element
import typingsJapgolly.reactNative.mod.NodeHandle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object librariesTypesCodegenTypesMod {
  
  type BubblingEventHandler[T, PaperName /* <: String | scala.Nothing */] = js.Function1[ReactEventFrom[NodeHandle & Element], Unit | js.Promise[Unit]]
  
  type DefaultTypes = scala.Double | Boolean | String | js.Array[String]
  
  type DirectEventHandler[T, PaperName /* <: String | scala.Nothing */] = js.Function1[ReactEventFrom[NodeHandle & Element], Unit | js.Promise[Unit]]
  
  type Double = scala.Double
  
  type Float = scala.Double
  
  type Int32 = scala.Double
  
  type UnsafeObject = js.Object
  
  type WithDefault[Type /* <: DefaultTypes */, Value /* <: js.UndefOr[Type | String | Null] */] = js.UndefOr[Type | Null]
}
