package typingsJapgolly.imageQ.mod

import typingsJapgolly.imageQ.anon.A
import typingsJapgolly.imageQ.anon.B
import typingsJapgolly.imageQ.anon.H
import typingsJapgolly.imageQ.anon.X
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object conversion {
  
  @JSImport("image-q", "conversion")
  @js.native
  val ^ : js.Any = js.native
  
  inline def lab2rgb(L: Double, a: Double, b: Double): B = (^.asInstanceOf[js.Dynamic].applyDynamic("lab2rgb")(L.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[B]
  
  inline def lab2xyz(L: Double, a: Double, b: Double): X = (^.asInstanceOf[js.Dynamic].applyDynamic("lab2xyz")(L.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[X]
  
  inline def rgb2hsl(r: Double, g: Double, b: Double): H = (^.asInstanceOf[js.Dynamic].applyDynamic("rgb2hsl")(r.asInstanceOf[js.Any], g.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[H]
  
  inline def rgb2lab(r: Double, g: Double, b: Double): A = (^.asInstanceOf[js.Dynamic].applyDynamic("rgb2lab")(r.asInstanceOf[js.Any], g.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[A]
  
  inline def rgb2xyz(r: Double, g: Double, b: Double): X = (^.asInstanceOf[js.Dynamic].applyDynamic("rgb2xyz")(r.asInstanceOf[js.Any], g.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[X]
  
  inline def xyz2lab(x: Double, y: Double, z: Double): A = (^.asInstanceOf[js.Dynamic].applyDynamic("xyz2lab")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any])).asInstanceOf[A]
  
  inline def xyz2rgb(x: Double, y: Double, z: Double): B = (^.asInstanceOf[js.Dynamic].applyDynamic("xyz2rgb")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any])).asInstanceOf[B]
}
