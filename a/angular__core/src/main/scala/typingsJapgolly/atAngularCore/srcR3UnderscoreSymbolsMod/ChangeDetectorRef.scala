package typingsJapgolly.atAngularCore.srcR3UnderscoreSymbolsMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChangeDetectorRef extends js.Object {
  /**
    * Checks the change detector and its children, and throws if any changes are detected.
    *
    * Use in development mode to verify that running change detection doesn't introduce
    * other changes.
    */
  def checkNoChanges(): Unit
  /**
    * Detaches this view from the change-detection tree.
    * A detached view is  not checked until it is reattached.
    * Use in combination with `detectChanges()` to implement local change detection checks.
    *
    * Detached views are not checked during change detection runs until they are
    * re-attached, even if they are marked as dirty.
    *
    * <!-- TODO: Add a link to a chapter on detach/reattach/local digest -->
    * <!-- TODO: Add a live demo once ref.detectChanges is merged into master -->
    *
    */
  def detach(): Unit
  /**
    * Checks this view and its children. Use in combination with {@link ChangeDetectorRef#detach
    * detach}
    * to implement local change detection checks.
    *
    * <!-- TODO: Add a link to a chapter on detach/reattach/local digest -->
    * <!-- TODO: Add a live demo once ref.detectChanges is merged into master -->
    *
    */
  def detectChanges(): Unit
  /**
    * When a view uses the {@link ChangeDetectionStrategy#OnPush OnPush} (checkOnce)
    * change detection strategy, explicitly marks the view as changed so that
    * it can be checked again.
    *
    * Components are normally marked as dirty (in need of rerendering) when inputs
    * have changed or events have fired in the view. Call this method to ensure that
    * a component is checked even if these triggers have not occured.
    *
    * <!-- TODO: Add a link to a chapter on OnPush components -->
    *
    */
  def markForCheck(): Unit
  /**
    * Re-attaches the previously detached view to the change detection tree.
    * Views are attached to the tree by default.
    *
    * <!-- TODO: Add a link to a chapter on detach/reattach/local digest -->
    *
    */
  def reattach(): Unit
}

object ChangeDetectorRef {
  @scala.inline
  def apply(
    checkNoChanges: Callback,
    detach: Callback,
    detectChanges: Callback,
    markForCheck: Callback,
    reattach: Callback
  ): ChangeDetectorRef = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("checkNoChanges")(checkNoChanges.toJsFn)
    __obj.updateDynamic("detach")(detach.toJsFn)
    __obj.updateDynamic("detectChanges")(detectChanges.toJsFn)
    __obj.updateDynamic("markForCheck")(markForCheck.toJsFn)
    __obj.updateDynamic("reattach")(reattach.toJsFn)
    __obj.asInstanceOf[ChangeDetectorRef]
  }
}

