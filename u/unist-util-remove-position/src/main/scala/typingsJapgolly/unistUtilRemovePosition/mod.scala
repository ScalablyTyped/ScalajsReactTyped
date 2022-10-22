package typingsJapgolly.unistUtilRemovePosition

import typingsJapgolly.unist.mod.Data
import typingsJapgolly.unistUtilRemovePosition.unistUtilRemovePositionBooleans.`false`
import typingsJapgolly.unistUtilRemovePosition.unistUtilRemovePositionBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("unist-util-remove-position", "removePosition")
  @js.native
  val removePosition: (js.Function2[
    /* tree */ typingsJapgolly.unist.mod.Node[Data], 
    /* force */ js.UndefOr[`false`], 
    typingsJapgolly.unist.mod.Node[Data]
  ]) & (js.Function2[
    /* tree */ typingsJapgolly.unist.mod.Node[Data], 
    `true`, 
    typingsJapgolly.unist.mod.Node[Data]
  ]) = js.native
  
  type Node = typingsJapgolly.unist.mod.Node[Data]
}
