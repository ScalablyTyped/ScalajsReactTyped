package typingsJapgolly.pixiJs.mod

import typingsJapgolly.pixiMath.mod.ISize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("pixi.js", "AbstractMultiResource")
@js.native
open class AbstractMultiResource protected ()
  extends typingsJapgolly.pixiCore.mod.AbstractMultiResource {
  /**
    * @param length
    * @param options - Options to for Resource constructor
    * @param {number} [options.width] - Width of the resource
    * @param {number} [options.height] - Height of the resource
    */
  def this(length: Double) = this()
  def this(length: Double, options: ISize) = this()
}
