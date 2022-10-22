package typingsJapgolly.grammarkdown.mod

import typingsJapgolly.grammarkdown.grammarkdownInts.`-1`
import typingsJapgolly.grammarkdown.grammarkdownInts.`0`
import typingsJapgolly.grammarkdown.grammarkdownInts.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Position {
  
  @JSImport("grammarkdown", "Position")
  @js.native
  val ^ : js.Any = js.native
  
  inline def clone_(position: typingsJapgolly.grammarkdown.distTypesMod.Position): typingsJapgolly.grammarkdown.distTypesMod.Position = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(position.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.grammarkdown.distTypesMod.Position]
  
  inline def compare(
    left: typingsJapgolly.grammarkdown.distTypesMod.Position,
    right: typingsJapgolly.grammarkdown.distTypesMod.Position
  ): `0` | `1` | `-1` = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[`0` | `1` | `-1`]
  
  inline def create(line: Double, character: Double): typingsJapgolly.grammarkdown.distTypesMod.Position = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(line.asInstanceOf[js.Any], character.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.grammarkdown.distTypesMod.Position]
  
  inline def equals_(
    left: typingsJapgolly.grammarkdown.distTypesMod.Position,
    right: typingsJapgolly.grammarkdown.distTypesMod.Position
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
