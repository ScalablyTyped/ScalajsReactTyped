package typingsJapgolly.wixUiCore

import typingsJapgolly.unidriverCore.mod.UniDriver
import typingsJapgolly.wixUiCore.distEsSrcComponentsTagsListTagDotuniDotdriverMod.TagUniDriver
import typingsJapgolly.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsSrcComponentsTagsListTagsListDotuniDotdriverMod {
  
  @JSImport("wix-ui-core/dist/es/src/components/tags-list/TagsList.uni.driver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def makeTagsListUniDriver(base: UniDriver[Any]): TagsListUniDriver = ^.asInstanceOf[js.Dynamic].applyDynamic("makeTagsListUniDriver")(base.asInstanceOf[js.Any]).asInstanceOf[TagsListUniDriver]
  
  @js.native
  trait TagsListUniDriver
    extends StObject
       with BaseUniDriver {
    
    def clickOnTagByIndex(): js.Promise[Unit] = js.native
    def clickOnTagByIndex(index: Double): js.Promise[Unit] = js.native
    
    def getTagByIndex(): TagUniDriver = js.native
    def getTagByIndex(index: Double): TagUniDriver = js.native
    
    def getTagCount(): js.Promise[Double] = js.native
    
    def getTags(): Any = js.native
  }
}
