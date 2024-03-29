package typingsJapgolly.rdflib

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.rdflib.libTfTypesMod.Term
import typingsJapgolly.rdflib.libTypesMod.Bindings
import typingsJapgolly.rdflib.libTypesMod.FromValueReturns
import typingsJapgolly.rdflib.libTypesMod.TermType
import typingsJapgolly.rdflib.libTypesMod.ValueType
import typingsJapgolly.rdflib.libTypesMod._ValueType
import typingsJapgolly.std.Number
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libNodeInternalMod {
  
  /* note: abstract class */ @JSImport("rdflib/lib/node-internal", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Node
       with _ValueType {
    /* protected */ def this(value: String) = this()
    
    /** The class order for this node */
    /* CompleteClass */
    var classOrder: Double = js.native
    
    /**
      * Compares this node with another
      * @see {equals} to check if two nodes are equal
      * @param other - The other node
      */
    /* CompleteClass */
    override def compareTerm(other: Node): Double = js.native
    
    /**
      * Compares whether the two nodes are equal
      * @param other The other node
      */
    /* CompleteClass */
    override def equals(other: Term): Boolean = js.native
    
    /**
      * Creates a hash for this node
      * @deprecated use {rdfFactory.id} instead if possible
      */
    /* CompleteClass */
    override def hashString(): String = js.native
    
    /**
      * Compares whether this node is the same as the other one
      * @param other - Another node
      */
    /* CompleteClass */
    override def sameTerm(other: Node): Boolean = js.native
    
    /**
      * Creates the substituted node for this one, according to the specified bindings
      * @param bindings - Bindings of identifiers to nodes
      */
    /* CompleteClass */
    override def substitute[T /* <: Node */](bindings: Bindings): T = js.native
    
    /** The type of node */
    /* CompleteClass */
    var termType: TermType = js.native
    
    /**
      * Creates a canonical string representation of this node
      */
    /* CompleteClass */
    override def toCanonical(): String = js.native
    
    /**
      * Creates a n-quads string representation of this node
      */
    /* CompleteClass */
    override def toNQ(): String = js.native
    
    /**
      * Creates a n-triples string representation of this node
      */
    /* CompleteClass */
    override def toNT(): String = js.native
    
    /** The node's value */
    /* CompleteClass */
    var value: String = js.native
  }
  /* static members */
  object default {
    
    @JSImport("rdflib/lib/node-internal", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromValue[T /* <: FromValueReturns[Any] */](value: ValueType): T = ^.asInstanceOf[js.Dynamic].applyDynamic("fromValue")(value.asInstanceOf[js.Any]).asInstanceOf[T]
    
    inline def toJS(term: Any): js.Date | Number | String | Boolean | js.Object | (js.Array[js.Date | Number | String | Boolean | js.Object]) = ^.asInstanceOf[js.Dynamic].applyDynamic("toJS")(term.asInstanceOf[js.Any]).asInstanceOf[js.Date | Number | String | Boolean | js.Object | (js.Array[js.Date | Number | String | Boolean | js.Object])]
  }
  
  trait Node extends StObject {
    
    /** The class order for this node */
    var classOrder: Double
    
    /**
      * Compares this node with another
      * @see {equals} to check if two nodes are equal
      * @param other - The other node
      */
    def compareTerm(other: Node): Double
    
    /**
      * Compares whether the two nodes are equal
      * @param other The other node
      */
    def equals(other: Term): Boolean
    
    /**
      * Creates a hash for this node
      * @deprecated use {rdfFactory.id} instead if possible
      */
    def hashString(): String
    
    /**
      * Compares whether this node is the same as the other one
      * @param other - Another node
      */
    def sameTerm(other: Node): Boolean
    
    /**
      * Creates the substituted node for this one, according to the specified bindings
      * @param bindings - Bindings of identifiers to nodes
      */
    def substitute[T /* <: Node */](bindings: Bindings): T
    
    /** The type of node */
    var termType: TermType
    
    /**
      * Creates a canonical string representation of this node
      */
    def toCanonical(): String
    
    /**
      * Creates a n-quads string representation of this node
      */
    def toNQ(): String
    
    /**
      * Creates a n-triples string representation of this node
      */
    def toNT(): String
    
    /** The node's value */
    var value: String
  }
  object Node {
    
    inline def apply(
      classOrder: Double,
      compareTerm: Node => Double,
      equals_ : Term => Boolean,
      hashString: CallbackTo[String],
      sameTerm: Node => Boolean,
      substitute: Bindings => Any,
      termType: TermType,
      toCanonical: CallbackTo[String],
      toNQ: CallbackTo[String],
      toNT: CallbackTo[String],
      value: String
    ): Node = {
      val __obj = js.Dynamic.literal(classOrder = classOrder.asInstanceOf[js.Any], compareTerm = js.Any.fromFunction1(compareTerm), hashString = hashString.toJsFn, sameTerm = js.Any.fromFunction1(sameTerm), substitute = js.Any.fromFunction1(substitute), termType = termType.asInstanceOf[js.Any], toCanonical = toCanonical.toJsFn, toNQ = toNQ.toJsFn, toNT = toNT.toJsFn, value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
      __obj.asInstanceOf[Node]
    }
    
    extension [Self <: Node](x: Self) {
      
      inline def setClassOrder(value: Double): Self = StObject.set(x, "classOrder", value.asInstanceOf[js.Any])
      
      inline def setCompareTerm(value: Node => Double): Self = StObject.set(x, "compareTerm", js.Any.fromFunction1(value))
      
      inline def setEquals_(value: Term => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
      
      inline def setHashString(value: CallbackTo[String]): Self = StObject.set(x, "hashString", value.toJsFn)
      
      inline def setSameTerm(value: Node => Boolean): Self = StObject.set(x, "sameTerm", js.Any.fromFunction1(value))
      
      inline def setSubstitute(value: Bindings => Any): Self = StObject.set(x, "substitute", js.Any.fromFunction1(value))
      
      inline def setTermType(value: TermType): Self = StObject.set(x, "termType", value.asInstanceOf[js.Any])
      
      inline def setToCanonical(value: CallbackTo[String]): Self = StObject.set(x, "toCanonical", value.toJsFn)
      
      inline def setToNQ(value: CallbackTo[String]): Self = StObject.set(x, "toNQ", value.toJsFn)
      
      inline def setToNT(value: CallbackTo[String]): Self = StObject.set(x, "toNT", value.toJsFn)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
