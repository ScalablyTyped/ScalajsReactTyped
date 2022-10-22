package typingsJapgolly.antvGBase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAbstractGroupMod {
  
  /* note: abstract class */ @JSImport("@antv/g-base/lib/abstract/group", JSImport.Default)
  @js.native
  open class default () extends AbstractGroup
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsJapgolly.antvGBase.libInterfacesMod.IObservable because Already inherited
  - typingsJapgolly.antvGBase.libInterfacesMod.IBase because Already inherited
  - typingsJapgolly.antvGBase.libInterfacesMod.IElement because Already inherited
  - typingsJapgolly.antvGBase.libInterfacesMod.IContainer because Already inherited
  - typingsJapgolly.antvGBase.libInterfacesMod.IGroup because var conflicts: cfg, destroyed. Inlined isEntityGroup */ @js.native
  trait AbstractGroup
    extends typingsJapgolly.antvGBase.libAbstractContainerMod.default {
    
    /**
      * 是否是实体分组，即对应实际的渲染元素
      * @return {boolean} 是否是实体分组
      */
    def isEntityGroup(): Boolean = js.native
  }
}
