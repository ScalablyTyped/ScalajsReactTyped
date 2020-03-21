package typingsJapgolly.next

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object utilsMod {
  type AppTreeType = typingsJapgolly.react.mod.ComponentType[typingsJapgolly.next.AppInitialPropsnamestring]
  type AppType = typingsJapgolly.next.utilsMod.NextComponentType[
    typingsJapgolly.next.utilsMod.AppContextType[typingsJapgolly.next.routerMod.NextRouter], 
    typingsJapgolly.next.utilsMod.AppInitialProps, 
    typingsJapgolly.next.utilsMod.AppPropsType[typingsJapgolly.next.routerMod.NextRouter, js.Object]
  ]
  type ComponentsEnhancer = typingsJapgolly.next.AnonEnhanceApp | (typingsJapgolly.next.utilsMod.Enhancer[
    typingsJapgolly.next.utilsMod.NextComponentType[typingsJapgolly.next.utilsMod.NextPageContext, js.Object, js.Object]
  ])
  type DocumentType = (typingsJapgolly.next.utilsMod.NextComponentType[
    typingsJapgolly.next.utilsMod.DocumentContext, 
    typingsJapgolly.next.utilsMod.DocumentInitialProps, 
    typingsJapgolly.next.utilsMod.DocumentProps
  ]) with typingsJapgolly.next.AnonRenderDocument
  type Enhancer[C] = js.Function1[/* Component */ C, C]
  type NextComponentType[C /* <: typingsJapgolly.next.utilsMod.BaseContext */, IP, P] = typingsJapgolly.react.mod.ComponentType[P] with (typingsJapgolly.next.AnonGetInitialProps[C, IP])
  type RenderPage = js.Function1[
    /* options */ js.UndefOr[typingsJapgolly.next.utilsMod.ComponentsEnhancer], 
    typingsJapgolly.next.utilsMod.RenderPageResult | js.Promise[typingsJapgolly.next.utilsMod.RenderPageResult]
  ]
  /**
    * Send body of response
    */
  type Send[T] = js.Function1[/* body */ T, scala.Unit]
}
