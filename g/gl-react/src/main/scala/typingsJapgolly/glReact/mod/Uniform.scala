package typingsJapgolly.glReact.mod

import typingsJapgolly.glReact.anon.Obj
import typingsJapgolly.glReact.anon.Ratio
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Uniform {
  
  @JSImport("gl-react", "Uniform")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("gl-react", "Uniform.Backbuffer")
  @js.native
  val Backbuffer: String = js.native
  
  @JSImport("gl-react", "Uniform.Resolution")
  @js.native
  val Resolution: String = js.native
  
  inline def backbufferFrom(node: Bus): typingsJapgolly.glReact.anon.Node = ^.asInstanceOf[js.Dynamic].applyDynamic("backbufferFrom")(node.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.glReact.anon.Node]
  inline def backbufferFrom(node: Node): typingsJapgolly.glReact.anon.Node = ^.asInstanceOf[js.Dynamic].applyDynamic("backbufferFrom")(node.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.glReact.anon.Node]
  
  inline def textureSize(obj: Any): Obj = ^.asInstanceOf[js.Dynamic].applyDynamic("textureSize")(obj.asInstanceOf[js.Any]).asInstanceOf[Obj]
  
  inline def textureSizeRatio(obj: Any): Ratio = ^.asInstanceOf[js.Dynamic].applyDynamic("textureSizeRatio")(obj.asInstanceOf[js.Any]).asInstanceOf[Ratio]
}
