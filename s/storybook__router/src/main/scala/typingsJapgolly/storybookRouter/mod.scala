package typingsJapgolly.storybookRouter

import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.reachRouter.mod.LocationProviderProps
import typingsJapgolly.reachRouter.mod.NavigateFn
import typingsJapgolly.react.mod.Component
import typingsJapgolly.storybookRouter.routerMod.QueryLinkProps
import typingsJapgolly.storybookRouter.routerMod.QueryLocationProps
import typingsJapgolly.storybookRouter.routerMod.QueryMatchProps
import typingsJapgolly.storybookRouter.routerMod.RouteProps
import typingsJapgolly.storybookRouter.utilsMod.Query
import typingsJapgolly.storybookRouter.utilsMod.StoryData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/router", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class LocationProvider ()
    extends Component[LocationProviderProps, js.Object, js.Any]
  
  val navigate: NavigateFn = js.native
  def getMatch(current: String, target: String): AnonPath = js.native
  def getMatch(current: String, target: String, startsWith: js.Any): AnonPath = js.native
  def parsePath(): StoryData = js.native
  def parsePath(path: String): StoryData = js.native
  def queryFromLocation(location: AnonSearch): Query = js.native
  def queryFromString(s: String): Query = js.native
  def stringifyQuery(query: Query): js.Any = js.native
  /* import warning: parser.TsParser#tsDeclVar Dropped IArray(parseKind, sanitize, storyNameFromExport) */ def toId(kind: String, name: String): String = js.native
  @js.native
  object Link extends js.Object {
    var displayName: String = js.native
    def apply(hasToChildrenRest: QueryLinkProps): Element = js.native
  }
  
  @js.native
  object Location extends js.Object {
    var displayName: String = js.native
    def apply(hasChildren: QueryLocationProps): Element = js.native
  }
  
  @js.native
  object Match extends js.Object {
    var displayName: String = js.native
    def apply(hasChildrenPathStartsWith: QueryMatchProps): Element = js.native
  }
  
  @js.native
  object Route extends js.Object {
    var displayName: String = js.native
    def apply(hasPathChildrenStartsWithHideOnly: RouteProps): Element = js.native
  }
  
}

