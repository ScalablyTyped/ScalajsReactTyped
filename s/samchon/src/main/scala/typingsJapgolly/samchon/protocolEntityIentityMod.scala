package typingsJapgolly.samchon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.sxml.mod.XML
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object protocolEntityIentityMod {
  
  trait IEntity extends StObject {
    
    /**
      * A tag name when represented by XML.
      *
      * <code> <TAG {...properties} /> </code>
      */
    def TAG(): String
    
    /**
      * Construct data of the Entity from a XML object.
      *
      * Overrides the construct() method and fetch data of member variables from the XML.
      *
      * By recommended guidance, data representing member variables are contained in properties
      * of the put XML object.
      *
      * @param xml An xml used to contruct data of entity.
      */
    def construct(xml: XML): Unit
    
    /**
      * Get a key that can identify the Entity uniquely.
      *
      * If identifier of the Entity is not atomic value, returns a paired or tuple object
      * that can represents the composite identifier.
      *
      * <code>
      * class Point extends Entity
      * {
      *     private x: number;
      *     private y: number;
      *
      *     public key(): std.Pair<number, number>
      *     {
      *         return std.make_pair(this.x, this.y);
      *     }
      * }
      * </code>
      */
    def key(): Any
    
    /**
      * Get a XML object represents the Entity.
      *
      * A member variable (not object, but atomic value like number, string or date) is categorized
      * as a property within the framework of entity side. Thus, when overriding a toXML() method and
      * archiving member variables to an XML object to return, puts each variable to be a property
      * belongs to only a XML object.
      *
      * Don't archive the member variable of atomic value to XML::value causing enormouse creation
      * of XML objects to number of member variables. An Entity must be represented by only a XML
      * instance (tag).
      *
      * <h4> Standard Usage. </h4>
      * <code>
      * <memberList>
      *	<member id='jhnam88' name='Jeongho Nam' birthdate='1988-03-11' />
      *	<member id='master' name='Administartor' birthdate='2011-07-28' />
      * </memberList>
      * </code>
      *
      * <h4> Non-standard usage abusing value. </h4>
      * <code>
      * <member>
      *	<id>jhnam88</id>
      *	<name>Jeongho Nam</name>
      *	<birthdate>1988-03-11</birthdate>
      * </member>
      * <member>
      *	<id>master</id>
      *	<name>Administartor</name>
      *	<birthdate>2011-07-28</birthdate>
      * </member>
      * </code>
      *
      * @return An XML object representing the Entity.
      */
    def toXML(): XML
  }
  object IEntity {
    
    inline def apply(TAG: CallbackTo[String], construct: XML => Callback, key: CallbackTo[Any], toXML: CallbackTo[XML]): IEntity = {
      val __obj = js.Dynamic.literal(TAG = TAG.toJsFn, construct = js.Any.fromFunction1((t0: XML) => construct(t0).runNow()), key = key.toJsFn, toXML = toXML.toJsFn)
      __obj.asInstanceOf[IEntity]
    }
    
    @JSImport("samchon/protocol/entity/IEntity", "IEntity")
    @js.native
    val ^ : js.Any = js.native
    
    inline def construct(entity: IEntity, xml: XML, prohibited_names: String*): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("construct")((scala.List(entity.asInstanceOf[js.Any], xml.asInstanceOf[js.Any])).`++`(prohibited_names.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Unit]
    
    inline def toXML(entity: IEntity, prohibited_names: String*): XML = ^.asInstanceOf[js.Dynamic].applyDynamic("toXML")(scala.List(entity.asInstanceOf[js.Any]).`++`(prohibited_names.asInstanceOf[Seq[js.Any]])*).asInstanceOf[XML]
    
    extension [Self <: IEntity](x: Self) {
      
      inline def setConstruct(value: XML => Callback): Self = StObject.set(x, "construct", js.Any.fromFunction1((t0: XML) => value(t0).runNow()))
      
      inline def setKey(value: CallbackTo[Any]): Self = StObject.set(x, "key", value.toJsFn)
      
      inline def setTAG(value: CallbackTo[String]): Self = StObject.set(x, "TAG", value.toJsFn)
      
      inline def setToXML(value: CallbackTo[XML]): Self = StObject.set(x, "toXML", value.toJsFn)
    }
  }
}
