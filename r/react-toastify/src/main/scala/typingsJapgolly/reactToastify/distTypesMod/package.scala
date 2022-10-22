package typingsJapgolly.reactToastify.distTypesMod

import japgolly.scalajs.react.facade.React.ComponentClassP
import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.react.mod.FC
import typingsJapgolly.reactToastify.anon.DefaultClassName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type Id = Double | String

type ToastClassName = (js.Function1[/* context */ js.UndefOr[DefaultClassName], String]) | String

type ToastContent[T] = Node | (js.Function1[/* props */ ToastContentProps[T], Node])

type ToastTransition = FC[ToastTransitionProps] | (ComponentClassP[ToastTransitionProps & js.Object])
