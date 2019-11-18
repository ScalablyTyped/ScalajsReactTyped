package typingsJapgolly.atAngularCommon.atAngularCommonMod

import typingsJapgolly.atAngularCore.atAngularCoreMod.DoCheck
import typingsJapgolly.atAngularCore.atAngularCoreMod.TemplateRef
import typingsJapgolly.atAngularCore.atAngularCoreMod.ViewContainerRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/common", "NgSwitchCase")
@js.native
class NgSwitchCase protected () extends DoCheck {
  def this(viewContainer: ViewContainerRef, templateRef: TemplateRef[js.Object], ngSwitch: NgSwitch) = this()
  var _view: js.Any = js.native
  var ngSwitch: js.Any = js.native
  /**
    * Stores the HTML template to be selected on match.
    */
  var ngSwitchCase: js.Any = js.native
  /**
    * A callback method that performs change-detection, invoked
    * after the default change-detector runs.
    * See `KeyValueDiffers` and `IterableDiffers` for implementing
    * custom change checking for collections.
    *
    */
  /* CompleteClass */
  override def ngDoCheck(): Unit = js.native
}

