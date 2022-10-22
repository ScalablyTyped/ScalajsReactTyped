package typingsJapgolly.opentypeJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("opentype.js", "GlyphNames")
@js.native
open class GlyphNames protected () extends StObject {
  def this(post: Post) = this()
  
  def glyphIndexToName(gid: Double): String = js.native
  
  def nameToGlyphIndex(name: String): Double = js.native
  
  /* private */ var names: Any = js.native
}
