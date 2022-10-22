package typingsJapgolly.grammarkdown.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Range {
  
  @JSImport("grammarkdown", "Range")
  @js.native
  val ^ : js.Any = js.native
  
  inline def clone_(range: typingsJapgolly.grammarkdown.distTypesMod.Range): typingsJapgolly.grammarkdown.distTypesMod.Range = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(range.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.grammarkdown.distTypesMod.Range]
  
  inline def collapseToEnd(range: typingsJapgolly.grammarkdown.distTypesMod.Range): typingsJapgolly.grammarkdown.distTypesMod.Range = ^.asInstanceOf[js.Dynamic].applyDynamic("collapseToEnd")(range.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.grammarkdown.distTypesMod.Range]
  
  inline def collapseToStart(range: typingsJapgolly.grammarkdown.distTypesMod.Range): typingsJapgolly.grammarkdown.distTypesMod.Range = ^.asInstanceOf[js.Dynamic].applyDynamic("collapseToStart")(range.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.grammarkdown.distTypesMod.Range]
  
  inline def contains(
    left: typingsJapgolly.grammarkdown.distTypesMod.Range,
    right: typingsJapgolly.grammarkdown.distTypesMod.Range
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("contains")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def containsPosition(
    range: typingsJapgolly.grammarkdown.distTypesMod.Range,
    position: typingsJapgolly.grammarkdown.distTypesMod.Position
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("containsPosition")(range.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def create(
    start: typingsJapgolly.grammarkdown.distTypesMod.Position,
    end: typingsJapgolly.grammarkdown.distTypesMod.Position
  ): typingsJapgolly.grammarkdown.distTypesMod.Range = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.grammarkdown.distTypesMod.Range]
  
  inline def equals_(
    left: typingsJapgolly.grammarkdown.distTypesMod.Range,
    right: typingsJapgolly.grammarkdown.distTypesMod.Range
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def intersects(
    left: typingsJapgolly.grammarkdown.distTypesMod.Range,
    right: typingsJapgolly.grammarkdown.distTypesMod.Range
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("intersects")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isCollapsed(range: typingsJapgolly.grammarkdown.distTypesMod.Range): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCollapsed")(range.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
