package typingsJapgolly.nodegit.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit", "Packbuilder")
@js.native
open class Packbuilder ()
  extends typingsJapgolly.nodegit.packBuilderMod.Packbuilder
/* static members */
object Packbuilder {
  
  @JSImport("nodegit", "Packbuilder")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(repo: typingsJapgolly.nodegit.repositoryMod.Repository): typingsJapgolly.nodegit.packBuilderMod.Packbuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(repo.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.nodegit.packBuilderMod.Packbuilder]
}
