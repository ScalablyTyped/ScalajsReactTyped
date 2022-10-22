package typingsJapgolly.samchon

import typingsJapgolly.ecol.mod.ArrayCollection
import typingsJapgolly.ecol.mod.DequeCollection
import typingsJapgolly.ecol.mod.ListCollection
import typingsJapgolly.samchon.protocolEntityIentityMod.IEntity
import typingsJapgolly.sxml.mod.XML
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object protocolEntityEntityCollectionMod {
  
  /* note: abstract class */ @JSImport("samchon/protocol/entity/EntityCollection", "EntityArrayCollection")
  @js.native
  open class EntityArrayCollection[T /* <: IEntity */] () extends ArrayCollection[T] {
    
    /**
      * @inheritdoc
      */
    def CHILD_TAG(): String = js.native
    
    /**
      * @inheritdoc
      */
    def TAG(): String = js.native
    
    /**
      * @inheritdoc
      */
    def construct(xml: XML): Unit = js.native
    
    /**
      * @inheritdoc
      */
    def count(key: Any): Double = js.native
    
    /**
      * @inheritdoc
      */
    def createChild(xml: XML): T = js.native
    
    /**
      * @inheritdoc
      */
    def get(key: Any): T = js.native
    
    /**
      * @inheritdoc
      */
    def has(key: Any): Boolean = js.native
    
    /**
      * @inheritdoc
      */
    def key(): Any = js.native
    
    /**
      * @inheritdoc
      */
    def toXML(): XML = js.native
  }
  
  /* note: abstract class */ @JSImport("samchon/protocol/entity/EntityCollection", "EntityDequeCollection")
  @js.native
  open class EntityDequeCollection[T /* <: IEntity */] () extends DequeCollection[T] {
    
    /**
      * @inheritdoc
      */
    def CHILD_TAG(): String = js.native
    
    /**
      * @inheritdoc
      */
    def TAG(): String = js.native
    
    /**
      * @inheritdoc
      */
    def construct(xml: XML): Unit = js.native
    
    /**
      * @inheritdoc
      */
    def count(key: Any): Double = js.native
    
    /**
      * @inheritdoc
      */
    def createChild(xml: XML): T = js.native
    
    /**
      * @inheritdoc
      */
    def get(key: Any): T = js.native
    
    /**
      * @inheritdoc
      */
    def has(key: Any): Boolean = js.native
    
    /**
      * @inheritdoc
      */
    def key(): Any = js.native
    
    /**
      * @inheritdoc
      */
    def toXML(): XML = js.native
  }
  
  /* note: abstract class */ @JSImport("samchon/protocol/entity/EntityCollection", "EntityListCollection")
  @js.native
  open class EntityListCollection[T /* <: IEntity */] () extends ListCollection[T] {
    
    /**
      * @inheritdoc
      */
    def CHILD_TAG(): String = js.native
    
    /**
      * @inheritdoc
      */
    def TAG(): String = js.native
    
    /**
      * @inheritdoc
      */
    def construct(xml: XML): Unit = js.native
    
    /**
      * @inheritdoc
      */
    def count(key: Any): Double = js.native
    
    /**
      * @inheritdoc
      */
    def createChild(xml: XML): T = js.native
    
    /**
      * @inheritdoc
      */
    def get(key: Any): T = js.native
    
    /**
      * @inheritdoc
      */
    def has(key: Any): Boolean = js.native
    
    /**
      * @inheritdoc
      */
    def key(): Any = js.native
    
    /**
      * @inheritdoc
      */
    def toXML(): XML = js.native
  }
}
