package typingsJapgolly.next.utilsMod

import typingsJapgolly.next.routerMod.NextRouter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined next.next/dist/next-server/lib/utils.AppInitialProps & {  Component  :next.next/dist/next-server/lib/utils.NextComponentType<next.next/dist/next-server/lib/utils.NextPageContext, any, P>,   router  :R} */
trait AppPropsType[R /* <: NextRouter */, P] extends js.Object {
  var Component: NextComponentType[NextPageContext, _, P]
  var pageProps: js.Any
  var router: R
}

object AppPropsType {
  @scala.inline
  def apply[R /* <: NextRouter */, P](Component: NextComponentType[NextPageContext, _, P], pageProps: js.Any, router: R): AppPropsType[R, P] = {
    val __obj = js.Dynamic.literal(Component = Component.asInstanceOf[js.Any], pageProps = pageProps.asInstanceOf[js.Any], router = router.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AppPropsType[R, P]]
  }
}

