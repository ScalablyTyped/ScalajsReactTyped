package typingsJapgolly.reactDnd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object interfacesMod {
  type DndComponentClass[C /* <: typingsJapgolly.react.mod.ComponentType[_] */, P] = (japgolly.scalajs.react.raw.React.ComponentClassP[
    (typingsJapgolly.react.mod._Global_.JSX.LibraryManagedAttributes[C, P]) with js.Object
  ]) with (typingsJapgolly.hoistNonReactStatics.mod.NonReactStatics[C, js.Object]) with typingsJapgolly.reactDnd.AnonDecoratedComponent[C]
  type DndComponentEnhancer[CollectedProps] = js.Function1[
    /* component */ js.Any, 
    typingsJapgolly.reactDnd.interfacesMod.DndComponentClass[
      js.Any, 
      typingsJapgolly.reactDnd.interfacesMod.Omit[typingsJapgolly.reactDnd.interfacesMod.GetProps[js.Any], java.lang.String]
    ]
  ]
  type DragLayerCollector[TargetProps, CollectedProps] = js.Function2[
    /* monitor */ typingsJapgolly.reactDnd.monitorsMod.DragLayerMonitor, 
    /* props */ TargetProps, 
    CollectedProps
  ]
  type DragSourceCollector[CollectedProps, TargetProps] = js.Function3[
    /* connect */ typingsJapgolly.reactDnd.interfacesMod.DragSourceConnector, 
    /* monitor */ typingsJapgolly.reactDnd.monitorsMod.DragSourceMonitor, 
    /* props */ TargetProps, 
    CollectedProps
  ]
  type DropTargetCollector[CollectedProps, TargetProps] = js.Function3[
    /* connect */ typingsJapgolly.reactDnd.interfacesMod.DropTargetConnector, 
    /* monitor */ typingsJapgolly.reactDnd.monitorsMod.DropTargetMonitor, 
    /* props */ TargetProps, 
    CollectedProps
  ]
  type GetProps[C] = js.Any
  type Matching[InjectedProps, DecorationTargetProps] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof DecorationTargetProps ]: P extends keyof InjectedProps? InjectedProps[P] extends DecorationTargetProps[P]? DecorationTargetProps[P] : InjectedProps[P] : DecorationTargetProps[P]}
    */ typingsJapgolly.reactDnd.reactDndStrings.Matching with js.Any
  type Omit[T, K /* <: java.lang.String */] = typingsJapgolly.std.Pick[T, typingsJapgolly.std.Exclude[java.lang.String, K]]
  type Shared[InjectedProps, DecorationTargetProps] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in std.Extract<keyof InjectedProps, keyof DecorationTargetProps> ]:? InjectedProps[P] extends DecorationTargetProps[P]? DecorationTargetProps[P] : never}
    */ typingsJapgolly.reactDnd.reactDndStrings.Shared with js.Any
}
