package typingsJapgolly.tsToolbelt

import typingsJapgolly.tsToolbelt.outAnyInternalMod.Match
import typingsJapgolly.tsToolbelt.outObjectIntersectKeysMod.IntersectKeys
import typingsJapgolly.tsToolbelt.outObjectPickMod.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outObjectIntersectMod {
  
  type Intersect[O /* <: js.Object */, O1 /* <: js.Object */, `match` /* <: Match */] = Pick[O, IntersectKeys[O, O1, `match`]]
}
