package typingsJapgolly.nextServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libUtilsMod {
  type AppType = typingsJapgolly.nextServer.libUtilsMod.NextComponentType[
    typingsJapgolly.nextServer.libUtilsMod.AppContextType[typingsJapgolly.nextServer.routerMod.NextRouter], 
    typingsJapgolly.nextServer.libUtilsMod.AppInitialProps, 
    typingsJapgolly.nextServer.libUtilsMod.AppPropsType[typingsJapgolly.nextServer.routerMod.NextRouter, js.Object]
  ]
  type ComponentsEnhancer = typingsJapgolly.nextServer.AnonEnhanceApp | (typingsJapgolly.nextServer.libUtilsMod.Enhancer[
    typingsJapgolly.nextServer.libUtilsMod.NextComponentType[typingsJapgolly.nextServer.libUtilsMod.NextPageContext, js.Object, js.Object]
  ])
  type DocumentType = typingsJapgolly.nextServer.libUtilsMod.NextComponentType[
    typingsJapgolly.nextServer.libUtilsMod.DocumentContext, 
    typingsJapgolly.nextServer.libUtilsMod.DocumentInitialProps, 
    typingsJapgolly.nextServer.libUtilsMod.DocumentProps
  ]
  type Enhancer[C] = js.Function1[/* Component */ C, C]
  type NextComponentType[C /* <: typingsJapgolly.nextServer.libUtilsMod.BaseContext */, IP, P] = typingsJapgolly.react.mod.ComponentType[P] with (typingsJapgolly.nextServer.AnonGetInitialProps[C, IP])
  type RenderPage = js.Function1[
    /* options */ js.UndefOr[typingsJapgolly.nextServer.libUtilsMod.ComponentsEnhancer], 
    typingsJapgolly.nextServer.libUtilsMod.RenderPageResult | js.Promise[typingsJapgolly.nextServer.libUtilsMod.RenderPageResult]
  ]
  /**
    * Send body of response
    */
  type Send[T] = js.Function1[/* body */ T, scala.Unit]
}
