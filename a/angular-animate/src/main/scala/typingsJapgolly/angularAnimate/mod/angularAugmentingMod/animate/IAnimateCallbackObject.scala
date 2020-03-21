package typingsJapgolly.angularAnimate.mod.angularAugmentingMod.animate

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.angular.JQuery
import typingsJapgolly.angular.mod._Global_.Function
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAnimateCallbackObject extends js.Object {
  var addClass: js.UndefOr[
    js.Function4[
      /* element */ JQuery, 
      /* addedClasses */ String, 
      /* doneFunction */ Function, 
      /* options */ IAnimationOptions, 
      _
    ]
  ] = js.undefined
  var animate: js.UndefOr[
    js.Function5[
      /* element */ JQuery, 
      /* fromStyles */ String, 
      /* toStyles */ String, 
      /* doneFunction */ Function, 
      /* options */ IAnimationOptions, 
      _
    ]
  ] = js.undefined
  var beforeAddClass: js.UndefOr[
    js.Function4[
      /* element */ JQuery, 
      /* addedClasses */ String, 
      /* doneFunction */ Function, 
      /* options */ IAnimationOptions, 
      _
    ]
  ] = js.undefined
  var beforeRemoveClass: js.UndefOr[
    js.Function4[
      /* element */ JQuery, 
      /* removedClasses */ String, 
      /* doneFunction */ Function, 
      /* options */ IAnimationOptions, 
      _
    ]
  ] = js.undefined
  var beforeSetClass: js.UndefOr[
    js.Function5[
      /* element */ JQuery, 
      /* addedClasses */ String, 
      /* removedClasses */ String, 
      /* doneFunction */ Function, 
      /* options */ IAnimationOptions, 
      _
    ]
  ] = js.undefined
  var enter: js.UndefOr[
    js.Function3[/* element */ JQuery, /* doneFunction */ Function, /* options */ IAnimationOptions, _]
  ] = js.undefined
  var eventFn: js.UndefOr[
    js.Function3[/* element */ JQuery, /* doneFunction */ Function, /* options */ IAnimationOptions, _]
  ] = js.undefined
  var leave: js.UndefOr[
    js.Function3[/* element */ JQuery, /* doneFunction */ Function, /* options */ IAnimationOptions, _]
  ] = js.undefined
  var move: js.UndefOr[
    js.Function3[/* element */ JQuery, /* doneFunction */ Function, /* options */ IAnimationOptions, _]
  ] = js.undefined
  var removeClass: js.UndefOr[
    js.Function4[
      /* element */ JQuery, 
      /* removedClasses */ String, 
      /* doneFunction */ Function, 
      /* options */ IAnimationOptions, 
      _
    ]
  ] = js.undefined
  var setClass: js.UndefOr[
    js.Function5[
      /* element */ JQuery, 
      /* addedClasses */ String, 
      /* removedClasses */ String, 
      /* doneFunction */ Function, 
      /* options */ IAnimationOptions, 
      _
    ]
  ] = js.undefined
}

object IAnimateCallbackObject {
  @scala.inline
  def apply(
    addClass: (/* element */ JQuery, /* addedClasses */ String, /* doneFunction */ Function, /* options */ IAnimationOptions) => CallbackTo[js.Any] = null,
    animate: (/* element */ JQuery, /* fromStyles */ String, /* toStyles */ String, /* doneFunction */ Function, /* options */ IAnimationOptions) => CallbackTo[js.Any] = null,
    beforeAddClass: (/* element */ JQuery, /* addedClasses */ String, /* doneFunction */ Function, /* options */ IAnimationOptions) => CallbackTo[js.Any] = null,
    beforeRemoveClass: (/* element */ JQuery, /* removedClasses */ String, /* doneFunction */ Function, /* options */ IAnimationOptions) => CallbackTo[js.Any] = null,
    beforeSetClass: (/* element */ JQuery, /* addedClasses */ String, /* removedClasses */ String, /* doneFunction */ Function, /* options */ IAnimationOptions) => CallbackTo[js.Any] = null,
    enter: (/* element */ JQuery, /* doneFunction */ Function, /* options */ IAnimationOptions) => CallbackTo[js.Any] = null,
    eventFn: (/* element */ JQuery, /* doneFunction */ Function, /* options */ IAnimationOptions) => CallbackTo[js.Any] = null,
    leave: (/* element */ JQuery, /* doneFunction */ Function, /* options */ IAnimationOptions) => CallbackTo[js.Any] = null,
    move: (/* element */ JQuery, /* doneFunction */ Function, /* options */ IAnimationOptions) => CallbackTo[js.Any] = null,
    removeClass: (/* element */ JQuery, /* removedClasses */ String, /* doneFunction */ Function, /* options */ IAnimationOptions) => CallbackTo[js.Any] = null,
    setClass: (/* element */ JQuery, /* addedClasses */ String, /* removedClasses */ String, /* doneFunction */ Function, /* options */ IAnimationOptions) => CallbackTo[js.Any] = null
  ): IAnimateCallbackObject = {
    val __obj = js.Dynamic.literal()
    if (addClass != null) __obj.updateDynamic("addClass")(js.Any.fromFunction4((t0: /* element */ typingsJapgolly.angular.JQuery, t1: /* addedClasses */ java.lang.String, t2: /* doneFunction */ typingsJapgolly.angular.mod._Global_.Function, t3: /* options */ typingsJapgolly.angularAnimate.mod.angularAugmentingMod.animate.IAnimationOptions) => addClass(t0, t1, t2, t3).runNow()))
    if (animate != null) __obj.updateDynamic("animate")(js.Any.fromFunction5((t0: /* element */ typingsJapgolly.angular.JQuery, t1: /* fromStyles */ java.lang.String, t2: /* toStyles */ java.lang.String, t3: /* doneFunction */ typingsJapgolly.angular.mod._Global_.Function, t4: /* options */ typingsJapgolly.angularAnimate.mod.angularAugmentingMod.animate.IAnimationOptions) => animate(t0, t1, t2, t3, t4).runNow()))
    if (beforeAddClass != null) __obj.updateDynamic("beforeAddClass")(js.Any.fromFunction4((t0: /* element */ typingsJapgolly.angular.JQuery, t1: /* addedClasses */ java.lang.String, t2: /* doneFunction */ typingsJapgolly.angular.mod._Global_.Function, t3: /* options */ typingsJapgolly.angularAnimate.mod.angularAugmentingMod.animate.IAnimationOptions) => beforeAddClass(t0, t1, t2, t3).runNow()))
    if (beforeRemoveClass != null) __obj.updateDynamic("beforeRemoveClass")(js.Any.fromFunction4((t0: /* element */ typingsJapgolly.angular.JQuery, t1: /* removedClasses */ java.lang.String, t2: /* doneFunction */ typingsJapgolly.angular.mod._Global_.Function, t3: /* options */ typingsJapgolly.angularAnimate.mod.angularAugmentingMod.animate.IAnimationOptions) => beforeRemoveClass(t0, t1, t2, t3).runNow()))
    if (beforeSetClass != null) __obj.updateDynamic("beforeSetClass")(js.Any.fromFunction5((t0: /* element */ typingsJapgolly.angular.JQuery, t1: /* addedClasses */ java.lang.String, t2: /* removedClasses */ java.lang.String, t3: /* doneFunction */ typingsJapgolly.angular.mod._Global_.Function, t4: /* options */ typingsJapgolly.angularAnimate.mod.angularAugmentingMod.animate.IAnimationOptions) => beforeSetClass(t0, t1, t2, t3, t4).runNow()))
    if (enter != null) __obj.updateDynamic("enter")(js.Any.fromFunction3((t0: /* element */ typingsJapgolly.angular.JQuery, t1: /* doneFunction */ typingsJapgolly.angular.mod._Global_.Function, t2: /* options */ typingsJapgolly.angularAnimate.mod.angularAugmentingMod.animate.IAnimationOptions) => enter(t0, t1, t2).runNow()))
    if (eventFn != null) __obj.updateDynamic("eventFn")(js.Any.fromFunction3((t0: /* element */ typingsJapgolly.angular.JQuery, t1: /* doneFunction */ typingsJapgolly.angular.mod._Global_.Function, t2: /* options */ typingsJapgolly.angularAnimate.mod.angularAugmentingMod.animate.IAnimationOptions) => eventFn(t0, t1, t2).runNow()))
    if (leave != null) __obj.updateDynamic("leave")(js.Any.fromFunction3((t0: /* element */ typingsJapgolly.angular.JQuery, t1: /* doneFunction */ typingsJapgolly.angular.mod._Global_.Function, t2: /* options */ typingsJapgolly.angularAnimate.mod.angularAugmentingMod.animate.IAnimationOptions) => leave(t0, t1, t2).runNow()))
    if (move != null) __obj.updateDynamic("move")(js.Any.fromFunction3((t0: /* element */ typingsJapgolly.angular.JQuery, t1: /* doneFunction */ typingsJapgolly.angular.mod._Global_.Function, t2: /* options */ typingsJapgolly.angularAnimate.mod.angularAugmentingMod.animate.IAnimationOptions) => move(t0, t1, t2).runNow()))
    if (removeClass != null) __obj.updateDynamic("removeClass")(js.Any.fromFunction4((t0: /* element */ typingsJapgolly.angular.JQuery, t1: /* removedClasses */ java.lang.String, t2: /* doneFunction */ typingsJapgolly.angular.mod._Global_.Function, t3: /* options */ typingsJapgolly.angularAnimate.mod.angularAugmentingMod.animate.IAnimationOptions) => removeClass(t0, t1, t2, t3).runNow()))
    if (setClass != null) __obj.updateDynamic("setClass")(js.Any.fromFunction5((t0: /* element */ typingsJapgolly.angular.JQuery, t1: /* addedClasses */ java.lang.String, t2: /* removedClasses */ java.lang.String, t3: /* doneFunction */ typingsJapgolly.angular.mod._Global_.Function, t4: /* options */ typingsJapgolly.angularAnimate.mod.angularAugmentingMod.animate.IAnimationOptions) => setClass(t0, t1, t2, t3, t4).runNow()))
    __obj.asInstanceOf[IAnimateCallbackObject]
  }
}

