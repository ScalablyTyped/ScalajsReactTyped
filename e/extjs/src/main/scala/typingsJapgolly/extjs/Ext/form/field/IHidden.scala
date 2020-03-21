package typingsJapgolly.extjs.Ext.form.field

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.extjs.Ext.IComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHidden extends IBase {
  /** [Method] Clear any invalid styles messages for this field  */
  @JSName("clearInvalid")
  var clearInvalid_IHidden: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Display one or more error messages associated with this field using msgTarget to determine how to display the messag  */
  @JSName("markInvalid")
  var markInvalid_IHidden: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Sets the height of the component
  		* @returns Ext.Component this
  		*/
  @JSName("setHeight")
  var setHeight_IHidden: js.UndefOr[js.Function0[IComponent]] = js.undefined
  /** [Method] Sets the page XY position of the component
  		* @returns Ext.Component this
  		*/
  @JSName("setPagePosition")
  var setPagePosition_IHidden: js.UndefOr[js.Function0[IComponent]] = js.undefined
  /** [Method] Sets the left and top of the component
  		* @returns Ext.Component this
  		*/
  @JSName("setPosition")
  var setPosition_IHidden: js.UndefOr[js.Function0[IComponent]] = js.undefined
  /** [Method] Sets the width and height of this Component
  		* @returns Ext.Component this
  		*/
  @JSName("setSize")
  var setSize_IHidden: js.UndefOr[js.Function0[IComponent]] = js.undefined
  /** [Method] Sets the width of the component
  		* @returns Ext.Component this
  		*/
  @JSName("setWidth")
  var setWidth_IHidden: js.UndefOr[js.Function0[IComponent]] = js.undefined
}

object IHidden {
  @scala.inline
  def apply(
    IBase: IBase = null,
    clearInvalid: js.UndefOr[Callback] = js.undefined,
    markInvalid: js.UndefOr[Callback] = js.undefined,
    setHeight: js.UndefOr[CallbackTo[IComponent]] = js.undefined,
    setPagePosition: js.UndefOr[CallbackTo[IComponent]] = js.undefined,
    setPosition: js.UndefOr[CallbackTo[IComponent]] = js.undefined,
    setSize: js.UndefOr[CallbackTo[IComponent]] = js.undefined,
    setWidth: js.UndefOr[CallbackTo[IComponent]] = js.undefined
  ): IHidden = {
    val __obj = js.Dynamic.literal()
    if (IBase != null) js.Dynamic.global.Object.assign(__obj, IBase)
    clearInvalid.foreach(p => __obj.updateDynamic("clearInvalid")(p.toJsFn))
    markInvalid.foreach(p => __obj.updateDynamic("markInvalid")(p.toJsFn))
    setHeight.foreach(p => __obj.updateDynamic("setHeight")(p.toJsFn))
    setPagePosition.foreach(p => __obj.updateDynamic("setPagePosition")(p.toJsFn))
    setPosition.foreach(p => __obj.updateDynamic("setPosition")(p.toJsFn))
    setSize.foreach(p => __obj.updateDynamic("setSize")(p.toJsFn))
    setWidth.foreach(p => __obj.updateDynamic("setWidth")(p.toJsFn))
    __obj.asInstanceOf[IHidden]
  }
}

