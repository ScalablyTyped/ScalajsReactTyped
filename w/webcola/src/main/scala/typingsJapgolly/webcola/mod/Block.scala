package typingsJapgolly.webcola.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webcola", "Block")
@js.native
open class Block protected ()
  extends typingsJapgolly.webcola.distSrcVpscMod.Block {
  def this(v: typingsJapgolly.webcola.distSrcVpscMod.Variable) = this()
}
/* static members */
object Block {
  
  @JSImport("webcola", "Block")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("webcola", "Block.createSplitBlock")
  @js.native
  def createSplitBlock: Any = js.native
  inline def createSplitBlock_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("createSplitBlock")(x.asInstanceOf[js.Any])
  
  inline def split(c: typingsJapgolly.webcola.distSrcVpscMod.Constraint): js.Array[typingsJapgolly.webcola.distSrcVpscMod.Block] = ^.asInstanceOf[js.Dynamic].applyDynamic("split")(c.asInstanceOf[js.Any]).asInstanceOf[js.Array[typingsJapgolly.webcola.distSrcVpscMod.Block]]
}
