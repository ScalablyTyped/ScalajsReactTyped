package typingsJapgolly.reactRelay.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import japgolly.scalajs.react.raw.React.Component
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactRelay.entryPointTypesMod.EntryPoint
import typingsJapgolly.reactRelay.entryPointTypesMod.EntryPointProps
import typingsJapgolly.reactRelay.entryPointTypesMod.EnvironmentProviderOptions
import typingsJapgolly.reactRelay.entryPointTypesMod.IEnvironmentProvider
import typingsJapgolly.reactRelay.lazyLoadEntryPointContainerMod.EntryPointContainerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object LazyLoadEntryPointContainer {
  def apply[TEntryPointParams /* <: js.Object */, TPreloadedQueries /* <: js.Object */, TPreloadedEntryPoints /* <: js.Object */, TRuntimeProps /* <: js.Object */, TExtraProps](
    entryPoint: EntryPoint[
      // tslint:disable-next-line no-unnecessary-generics
  TEntryPointParams, 
      Component[
        (EntryPointProps[
          // tslint:disable-next-line no-unnecessary-generics
  TPreloadedQueries, 
          // tslint:disable-next-line no-unnecessary-generics
  TPreloadedEntryPoints, 
          // tslint:disable-next-line no-unnecessary-generics
  TRuntimeProps, 
          // tslint:disable-next-line no-unnecessary-generics
  TExtraProps
        ]) with js.Object, 
        js.Object
      ]
    ],
    entryPointParams: // tslint:disable-next-line no-unnecessary-generics
  TEntryPointParams,
    props: // tslint:disable-next-line no-unnecessary-generics
  TRuntimeProps,
    environmentProvider: IEnvironmentProvider[EnvironmentProviderOptions] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    EntryPointContainerProps[
      // tslint:disable-next-line no-unnecessary-generics
  TEntryPointParams, 
      // tslint:disable-next-line no-unnecessary-generics
  TPreloadedQueries, 
      // tslint:disable-next-line no-unnecessary-generics
  TPreloadedEntryPoints, 
      // tslint:disable-next-line no-unnecessary-generics
  TRuntimeProps, 
      // tslint:disable-next-line no-unnecessary-generics
  TExtraProps
    ], 
    MountedWithRawType[
      EntryPointContainerProps[
        // tslint:disable-next-line no-unnecessary-generics
  TEntryPointParams, 
        // tslint:disable-next-line no-unnecessary-generics
  TPreloadedQueries, 
        // tslint:disable-next-line no-unnecessary-generics
  TPreloadedEntryPoints, 
        // tslint:disable-next-line no-unnecessary-generics
  TRuntimeProps, 
        // tslint:disable-next-line no-unnecessary-generics
  TExtraProps
      ], 
      js.Object, 
      RawMounted[
        EntryPointContainerProps[
          // tslint:disable-next-line no-unnecessary-generics
  TEntryPointParams, 
          // tslint:disable-next-line no-unnecessary-generics
  TPreloadedQueries, 
          // tslint:disable-next-line no-unnecessary-generics
  TPreloadedEntryPoints, 
          // tslint:disable-next-line no-unnecessary-generics
  TRuntimeProps, 
          // tslint:disable-next-line no-unnecessary-generics
  TExtraProps
        ], 
        js.Object
      ]
    ]
  ] = {
    val __obj = js.Dynamic.literal(entryPoint = entryPoint.asInstanceOf[js.Any], entryPointParams = entryPointParams.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
  
      if (environmentProvider != null) __obj.updateDynamic("environmentProvider")(environmentProvider.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.reactRelay.lazyLoadEntryPointContainerMod.EntryPointContainerProps[
    // tslint:disable-next-line no-unnecessary-generics
  TEntryPointParams, 
    // tslint:disable-next-line no-unnecessary-generics
  TPreloadedQueries, 
    // tslint:disable-next-line no-unnecessary-generics
  TPreloadedEntryPoints, 
    // tslint:disable-next-line no-unnecessary-generics
  TRuntimeProps, 
    // tslint:disable-next-line no-unnecessary-generics
  TExtraProps
  ], 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactRelay.lazyLoadEntryPointContainerMod.EntryPointContainerProps[
  // tslint:disable-next-line no-unnecessary-generics
  TEntryPointParams, 
  // tslint:disable-next-line no-unnecessary-generics
  TPreloadedQueries, 
  // tslint:disable-next-line no-unnecessary-generics
  TPreloadedEntryPoints, 
  // tslint:disable-next-line no-unnecessary-generics
  TRuntimeProps, 
  // tslint:disable-next-line no-unnecessary-generics
  TExtraProps]])(children: _*)
  }
  @JSImport("react-relay/hooks", "LazyLoadEntryPointContainer")
  @js.native
  object componentImport extends js.Object
  
}

