package typingsJapgolly.atAngularCore.testingMod

import typingsJapgolly.atAngularCore.atAngularCoreMod.ComponentRef
import typingsJapgolly.atAngularCore.atAngularCoreMod.NgZone
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core/testing", "ComponentFixture")
@js.native
class ComponentFixture[T] protected ()
  extends typingsJapgolly.atAngularCore.testingTestingMod.ComponentFixture[T] {
  def this(componentRef: ComponentRef[T], ngZone: Null, _autoDetect: Boolean) = this()
  def this(componentRef: ComponentRef[T], ngZone: NgZone, _autoDetect: Boolean) = this()
}

