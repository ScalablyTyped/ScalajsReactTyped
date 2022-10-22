package typingsJapgolly.node

import typingsJapgolly.node.readlineMod.Direction
import typingsJapgolly.node.v8Mod.DoesZapCodeSpaceFlag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeInts {
  
  @js.native
  sealed trait `-1`
    extends StObject
       with Direction
       with typingsJapgolly.node.ttyMod.Direction
  inline def `-1`: `-1` = -1.asInstanceOf[`-1`]
  
  @js.native
  sealed trait `0`
    extends StObject
       with Direction
       with typingsJapgolly.node.ttyMod.Direction
       with DoesZapCodeSpaceFlag
  inline def `0`: `0` = 0.asInstanceOf[`0`]
  
  @js.native
  sealed trait `1`
    extends StObject
       with Direction
       with typingsJapgolly.node.ttyMod.Direction
       with DoesZapCodeSpaceFlag
  inline def `1`: `1` = 1.asInstanceOf[`1`]
  
  @js.native
  sealed trait `2` extends StObject
  inline def `2`: `2` = 2.asInstanceOf[`2`]
}
