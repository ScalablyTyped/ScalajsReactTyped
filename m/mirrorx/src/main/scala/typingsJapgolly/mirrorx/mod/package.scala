package typingsJapgolly.mirrorx.mod

import japgolly.scalajs.react.facade.React.ComponentClassP
import typingsJapgolly.mirrorx.mirrorxStrings.`match`
import typingsJapgolly.mirrorx.mirrorxStrings.history
import typingsJapgolly.mirrorx.mirrorxStrings.location
import typingsJapgolly.mirrorx.mirrorxStrings.staticContext
import typingsJapgolly.mirrorx.mod.^
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.reactRedux.esComponentsConnectMod.Connect
import typingsJapgolly.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def actions: Actions_ = ^.asInstanceOf[js.Dynamic].selectDynamic("actions").asInstanceOf[Actions_]

inline def connect: Connect[Any] = ^.asInstanceOf[js.Dynamic].selectDynamic("connect").asInstanceOf[Connect[Any]]

inline def defaults(): js.Function1[/* options */ defaultOptions, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("defaults")().asInstanceOf[js.Function1[/* options */ defaultOptions, Unit]]

inline def hook(): js.Function1[/* subscriber */ js.Function0[Any], Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("hook")().asInstanceOf[js.Function1[/* subscriber */ js.Function0[Any], Any]]

inline def render: Renderer = ^.asInstanceOf[js.Dynamic].selectDynamic("render").asInstanceOf[Renderer]

inline def withRouter[P /* <: RouteComponentProps[Any] */](component: ComponentType[P]): ComponentClassP[
(Omit[
  P, 
  /* keyof mirrorx.mirrorx.RouteComponentProps<any> */ `match` | location | history | staticContext
]) & js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("withRouter")(component.asInstanceOf[js.Any]).asInstanceOf[ComponentClassP[
(Omit[
  P, 
  /* keyof mirrorx.mirrorx.RouteComponentProps<any> */ `match` | location | history | staticContext
]) & js.Object]]
inline def withRouter[TFunction /* <: ComponentClassP[Any & js.Object] */](target: TFunction): TFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("withRouter")(target.asInstanceOf[js.Any]).asInstanceOf[TFunction]

type Omit[T, K /* <: /* keyof T */ String */] = Pick[
T, 
/* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]: P} & {[ P in K ]: never} & {[x: string] : never, [x: number] : never}[keyof T] */ js.Any]
