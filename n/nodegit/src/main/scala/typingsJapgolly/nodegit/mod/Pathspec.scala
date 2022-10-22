package typingsJapgolly.nodegit.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit", "Pathspec")
@js.native
open class Pathspec ()
  extends typingsJapgolly.nodegit.pathSpecMod.Pathspec
/* static members */
object Pathspec {
  
  @JSImport("nodegit", "Pathspec")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(pathspec: String): typingsJapgolly.nodegit.pathSpecMod.Pathspec = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(pathspec.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.nodegit.pathSpecMod.Pathspec]
  inline def create(pathspec: js.Array[String]): typingsJapgolly.nodegit.pathSpecMod.Pathspec = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(pathspec.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.nodegit.pathSpecMod.Pathspec]
  inline def create(pathspec: typingsJapgolly.nodegit.strArrayMod.Strarray): typingsJapgolly.nodegit.pathSpecMod.Pathspec = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(pathspec.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.nodegit.pathSpecMod.Pathspec]
  
  inline def matchListDiffEntry(m: Any, pos: Double): typingsJapgolly.nodegit.diffDeltaMod.DiffDelta = (^.asInstanceOf[js.Dynamic].applyDynamic("matchListDiffEntry")(m.asInstanceOf[js.Any], pos.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.nodegit.diffDeltaMod.DiffDelta]
  
  inline def matchListEntry(m: Any, pos: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("matchListEntry")(m.asInstanceOf[js.Any], pos.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def matchListEntrycount(m: Any): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("matchListEntrycount")(m.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def matchListFailedEntry(m: Any, pos: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("matchListFailedEntry")(m.asInstanceOf[js.Any], pos.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def matchListFailedEntrycount(m: Any): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("matchListFailedEntrycount")(m.asInstanceOf[js.Any]).asInstanceOf[Double]
}
