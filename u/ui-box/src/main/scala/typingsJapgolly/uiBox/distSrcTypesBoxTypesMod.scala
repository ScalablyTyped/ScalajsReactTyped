package typingsJapgolly.uiBox

import japgolly.scalajs.react.facade.React.ElementType
import typingsJapgolly.react.mod.ComponentPropsWithRef
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.react.mod.global.JSX.LibraryManagedAttributes
import typingsJapgolly.std.Exclude
import typingsJapgolly.std.Pick
import typingsJapgolly.uiBox.anon.AllowUnsafeHref
import typingsJapgolly.uiBox.distSrcTypesEnhancersMod.EnhancerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcTypesBoxTypesMod {
  
  type BoxComponent[P, D /* <: ElementType */] = js.Function1[/* props */ PolymorphicBoxProps[D, P], Element]
  
  type BoxOwnProps[E /* <: ElementType */, P] = (Without[EnhancerProps, /* keyof P */ String]) & AllowUnsafeHref[E]
  
  type BoxProps[E /* <: ElementType */] = (BoxOwnProps[E, js.Object]) & (Without[
    PropsOf[E], 
    /* keyof ui-box.anon.BoxOwnPropsElementTypeany */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 145, starting with typingsJapgolly.uiBox.uiBoxStrings.borderColor, typingsJapgolly.uiBox.uiBoxStrings.gridTemplate, typingsJapgolly.uiBox.uiBoxStrings.backgroundImage */ Any
  ])
  
  type PolymorphicBoxProps[E /* <: ElementType */, P] = (BoxOwnProps[E, P]) & (Without[
    PropsOf[E], 
    /* keyof ui-box.anon.BoxOwnPropsElementTypeany & P */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 145, starting with typingsJapgolly.uiBox.uiBoxStrings.borderColor, typingsJapgolly.uiBox.uiBoxStrings.gridTemplate, typingsJapgolly.uiBox.uiBoxStrings.backgroundImage */ Any
  ]) & P
  
  type PropsOf[E /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176, starting with typingsJapgolly.uiBox.uiBoxStrings.a, typingsJapgolly.uiBox.uiBoxStrings.abbr, typingsJapgolly.uiBox.uiBoxStrings.address */ Any */] = LibraryManagedAttributes[E, ComponentPropsWithRef[E]]
  
  type Without[T, K] = Pick[T, Exclude[/* keyof T */ String, K]]
}
