package typingsJapgolly.wonderJs.distEs2015Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder.js/dist/es2015", "Matrix4")
@js.native
open class Matrix4 ()
  extends typingsJapgolly.wonderJs.distEs2015MathMatrix4Mod.Matrix4 {
  def this(mat: js.typedarray.Float32Array) = this()
}
/* static members */
object Matrix4 {
  
  @JSImport("wonder.js/dist/es2015", "Matrix4")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(): typingsJapgolly.wonderJs.distEs2015MathMatrix4Mod.Matrix4 = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typingsJapgolly.wonderJs.distEs2015MathMatrix4Mod.Matrix4]
  inline def create(mat: js.typedarray.Float32Array): typingsJapgolly.wonderJs.distEs2015MathMatrix4Mod.Matrix4 = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(mat.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.wonderJs.distEs2015MathMatrix4Mod.Matrix4]
}
