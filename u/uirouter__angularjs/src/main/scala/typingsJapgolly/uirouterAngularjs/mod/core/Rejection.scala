package typingsJapgolly.uirouterAngularjs.mod.core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@uirouter/angularjs", "core.Rejection")
@js.native
open class Rejection protected ()
  extends typingsJapgolly.uirouterCore.mod.Rejection {
  def this(`type`: Double) = this()
  def this(`type`: Double, message: String) = this()
  def this(`type`: Double, message: String, detail: Any) = this()
  def this(`type`: Double, message: Unit, detail: Any) = this()
}
/* static members */
object Rejection {
  
  @JSImport("@uirouter/angularjs", "core.Rejection")
  @js.native
  val ^ : js.Any = js.native
  
  /** Returns a Rejection due to aborted transition */
  inline def aborted(): typingsJapgolly.uirouterCore.libTransitionRejectFactoryMod.Rejection = ^.asInstanceOf[js.Dynamic].applyDynamic("aborted")().asInstanceOf[typingsJapgolly.uirouterCore.libTransitionRejectFactoryMod.Rejection]
  inline def aborted(detail: Any): typingsJapgolly.uirouterCore.libTransitionRejectFactoryMod.Rejection = ^.asInstanceOf[js.Dynamic].applyDynamic("aborted")(detail.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.uirouterCore.libTransitionRejectFactoryMod.Rejection]
  
  /** Returns a Rejection due to aborted transition */
  inline def errored(): typingsJapgolly.uirouterCore.libTransitionRejectFactoryMod.Rejection = ^.asInstanceOf[js.Dynamic].applyDynamic("errored")().asInstanceOf[typingsJapgolly.uirouterCore.libTransitionRejectFactoryMod.Rejection]
  inline def errored(detail: Any): typingsJapgolly.uirouterCore.libTransitionRejectFactoryMod.Rejection = ^.asInstanceOf[js.Dynamic].applyDynamic("errored")(detail.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.uirouterCore.libTransitionRejectFactoryMod.Rejection]
  
  /** Returns a Rejection due to ignored transition */
  inline def ignored(): typingsJapgolly.uirouterCore.libTransitionRejectFactoryMod.Rejection = ^.asInstanceOf[js.Dynamic].applyDynamic("ignored")().asInstanceOf[typingsJapgolly.uirouterCore.libTransitionRejectFactoryMod.Rejection]
  inline def ignored(detail: Any): typingsJapgolly.uirouterCore.libTransitionRejectFactoryMod.Rejection = ^.asInstanceOf[js.Dynamic].applyDynamic("ignored")(detail.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.uirouterCore.libTransitionRejectFactoryMod.Rejection]
  
  /** Returns a Rejection due to invalid transition */
  inline def invalid(): typingsJapgolly.uirouterCore.libTransitionRejectFactoryMod.Rejection = ^.asInstanceOf[js.Dynamic].applyDynamic("invalid")().asInstanceOf[typingsJapgolly.uirouterCore.libTransitionRejectFactoryMod.Rejection]
  inline def invalid(detail: Any): typingsJapgolly.uirouterCore.libTransitionRejectFactoryMod.Rejection = ^.asInstanceOf[js.Dynamic].applyDynamic("invalid")(detail.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.uirouterCore.libTransitionRejectFactoryMod.Rejection]
  
  /** Returns true if the obj is a rejected promise created from the `asPromise` factory */
  inline def isRejectionPromise(obj: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRejectionPromise")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /**
    * Returns a Rejection
    *
    * Normalizes a value as a Rejection.
    * If the value is already a Rejection, returns it.
    * Otherwise, wraps and returns the value as a Rejection (Rejection type: ERROR).
    *
    * @returns `detail` if it is already a `Rejection`, else returns an ERROR Rejection.
    */
  inline def normalize(): typingsJapgolly.uirouterCore.libTransitionRejectFactoryMod.Rejection = ^.asInstanceOf[js.Dynamic].applyDynamic("normalize")().asInstanceOf[typingsJapgolly.uirouterCore.libTransitionRejectFactoryMod.Rejection]
  inline def normalize(detail: js.Error): typingsJapgolly.uirouterCore.libTransitionRejectFactoryMod.Rejection = ^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(detail.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.uirouterCore.libTransitionRejectFactoryMod.Rejection]
  inline def normalize(detail: Any): typingsJapgolly.uirouterCore.libTransitionRejectFactoryMod.Rejection = ^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(detail.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.uirouterCore.libTransitionRejectFactoryMod.Rejection]
  inline def normalize(detail: typingsJapgolly.uirouterCore.libTransitionRejectFactoryMod.Rejection): typingsJapgolly.uirouterCore.libTransitionRejectFactoryMod.Rejection = ^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(detail.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.uirouterCore.libTransitionRejectFactoryMod.Rejection]
  
  /** Returns a Rejection due to redirected transition */
  inline def redirected(): typingsJapgolly.uirouterCore.libTransitionRejectFactoryMod.Rejection = ^.asInstanceOf[js.Dynamic].applyDynamic("redirected")().asInstanceOf[typingsJapgolly.uirouterCore.libTransitionRejectFactoryMod.Rejection]
  inline def redirected(detail: Any): typingsJapgolly.uirouterCore.libTransitionRejectFactoryMod.Rejection = ^.asInstanceOf[js.Dynamic].applyDynamic("redirected")(detail.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.uirouterCore.libTransitionRejectFactoryMod.Rejection]
  
  /** Returns a Rejection due to transition superseded */
  inline def superseded(): typingsJapgolly.uirouterCore.libTransitionRejectFactoryMod.Rejection = ^.asInstanceOf[js.Dynamic].applyDynamic("superseded")().asInstanceOf[typingsJapgolly.uirouterCore.libTransitionRejectFactoryMod.Rejection]
  inline def superseded(detail: Any): typingsJapgolly.uirouterCore.libTransitionRejectFactoryMod.Rejection = ^.asInstanceOf[js.Dynamic].applyDynamic("superseded")(detail.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.uirouterCore.libTransitionRejectFactoryMod.Rejection]
  inline def superseded(detail: Any, options: Any): typingsJapgolly.uirouterCore.libTransitionRejectFactoryMod.Rejection = (^.asInstanceOf[js.Dynamic].applyDynamic("superseded")(detail.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.uirouterCore.libTransitionRejectFactoryMod.Rejection]
  inline def superseded(detail: Unit, options: Any): typingsJapgolly.uirouterCore.libTransitionRejectFactoryMod.Rejection = (^.asInstanceOf[js.Dynamic].applyDynamic("superseded")(detail.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.uirouterCore.libTransitionRejectFactoryMod.Rejection]
}
