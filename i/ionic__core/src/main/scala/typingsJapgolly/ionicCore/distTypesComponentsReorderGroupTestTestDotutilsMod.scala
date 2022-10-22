package typingsJapgolly.ionicCore

import typingsJapgolly.ionicCore.ionicCoreStrings.down
import typingsJapgolly.ionicCore.ionicCoreStrings.up
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComponentsReorderGroupTestTestDotutilsMod {
  
  @JSImport("@ionic/core/dist/types/components/reorder-group/test/test.utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def moveReorderItem(
    id: String,
    page: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify pd.E2EPage */ Any,
    direction: up | down,
    numberOfSpaces: Double,
    parentSelectors: String*
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("moveReorderItem")((scala.List(id.asInstanceOf[js.Any], page.asInstanceOf[js.Any], direction.asInstanceOf[js.Any], numberOfSpaces.asInstanceOf[js.Any])).`++`(parentSelectors.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[js.Promise[Unit]]
  inline def moveReorderItem(
    id: String,
    page: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify pd.E2EPage */ Any,
    direction: up | down,
    numberOfSpaces: Unit,
    parentSelectors: String*
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("moveReorderItem")((scala.List(id.asInstanceOf[js.Any], page.asInstanceOf[js.Any], direction.asInstanceOf[js.Any], numberOfSpaces.asInstanceOf[js.Any])).`++`(parentSelectors.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[js.Promise[Unit]]
  inline def moveReorderItem(
    id: String,
    page: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify pd.E2EPage */ Any,
    direction: Unit,
    numberOfSpaces: Double,
    parentSelectors: String*
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("moveReorderItem")((scala.List(id.asInstanceOf[js.Any], page.asInstanceOf[js.Any], direction.asInstanceOf[js.Any], numberOfSpaces.asInstanceOf[js.Any])).`++`(parentSelectors.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[js.Promise[Unit]]
  inline def moveReorderItem(
    id: String,
    page: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify pd.E2EPage */ Any,
    direction: Unit,
    numberOfSpaces: Unit,
    parentSelectors: String*
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("moveReorderItem")((scala.List(id.asInstanceOf[js.Any], page.asInstanceOf[js.Any], direction.asInstanceOf[js.Any], numberOfSpaces.asInstanceOf[js.Any])).`++`(parentSelectors.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[js.Promise[Unit]]
}
