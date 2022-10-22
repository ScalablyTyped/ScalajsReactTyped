package typingsJapgolly.tsToolbelt

import typingsJapgolly.tsToolbelt.outAnyInternalMod.Match
import typingsJapgolly.tsToolbelt.outMiscBuiltInMod.BuiltIn
import typingsJapgolly.tsToolbelt.outObjectExcludeMod.Exclude
import typingsJapgolly.tsToolbelt.outObjectPatchMod.PatchFlat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outObjectDiffMod {
  
  type Diff[O /* <: js.Object */, O1 /* <: js.Object */, `match` /* <: Match */] = PatchFlat[Exclude[O, O1, `match`], Exclude[O1, O, `match`], BuiltIn, scala.Nothing]
}
