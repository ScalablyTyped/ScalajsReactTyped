package typingsJapgolly.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.Pickle.IPickleStep
import typingsJapgolly.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.Pickle.IPickleTag
import typingsJapgolly.protobufjs.mod.IConversionOptions
import typingsJapgolly.protobufjs.mod.Reader
import typingsJapgolly.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A `Pickle` represents a test case Cucumber can *execute*. It is typically derived
  * from another format, such as [GherkinDocument](#io.cucumber.messages.GherkinDocument).
  * In the future a `Pickle` may be derived from other formats such as Markdown or
  * Excel files.
  *
  * By making `Pickle` the main data structure Cucumber uses for execution, the
  * implementation of Cucumber itself becomes simpler, as it doesn't have to deal
  * with the complex structure of a [GherkinDocument](#io.cucumber.messages.GherkinDocument).
  */
@JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.Pickle")
@js.native
/**
  * Constructs a new Pickle.
  * @param [properties] Properties to set
  */
open class Pickle ()
  extends StObject
     with IPickle {
  def this(properties: IPickle) = this()
  
  /**
    * Points to the AST node locations of the pickle. The last one represents the unique
    * id of the pickle. A pickle constructed from `Examples` will have the first
    * id originating from the `Scenario` AST node, and the second from the `TableRow` AST node.
    */
  @JSName("astNodeIds")
  var astNodeIds_Pickle: js.Array[String] = js.native
  
  /**
    * A unique id for the pickle. This is a [SHA1](https://en.wikipedia.org/wiki/SHA-1) hash
    * from the source data and the `locations` of the pickle.
    * This ID will change if source the file is modified.
    */
  @JSName("id")
  var id_Pickle: String = js.native
  
  /** Pickle language. */
  @JSName("language")
  var language_Pickle: String = js.native
  
  /** Pickle name. */
  @JSName("name")
  var name_Pickle: String = js.native
  
  /** Pickle steps. */
  @JSName("steps")
  var steps_Pickle: js.Array[IPickleStep] = js.native
  
  /**
    * One or more tags. If this pickle is constructed from a Gherkin document,
    * It includes inherited tags from the `Feature` as well.
    */
  @JSName("tags")
  var tags_Pickle: js.Array[IPickleTag] = js.native
  
  /**
    * Converts this Pickle to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
  
  /** Pickle uri. */
  @JSName("uri")
  var uri_Pickle: String = js.native
}
object Pickle {
  
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.Pickle")
  @js.native
  val ^ : js.Any = js.native
  
  /** An executable step */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.Pickle.PickleStep")
  @js.native
  /**
    * Constructs a new PickleStep.
    * @param [properties] Properties to set
    */
  open class PickleStep ()
    extends StObject
       with IPickleStep {
    def this(properties: IPickleStep) = this()
    
    /** PickleStep astNodeIds. */
    @JSName("astNodeIds")
    var astNodeIds_PickleStep: js.Array[String] = js.native
    
    /** PickleStep id. */
    @JSName("id")
    var id_PickleStep: String = js.native
    
    /** PickleStep text. */
    @JSName("text")
    var text_PickleStep: String = js.native
    
    /**
      * Converts this PickleStep to JSON.
      * @returns JSON object
      */
    def toJSON(): StringDictionary[Any] = js.native
  }
  object PickleStep {
    
    @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.Pickle.PickleStep")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new PickleStep instance using the specified properties.
      * @param [properties] Properties to set
      * @returns PickleStep instance
      */
    /* static member */
    inline def create(): PickleStep = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[PickleStep]
    inline def create(properties: IPickleStep): PickleStep = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[PickleStep]
    
    inline def decode(reader: js.typedarray.Uint8Array): PickleStep = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[PickleStep]
    inline def decode(reader: js.typedarray.Uint8Array, length: Double): PickleStep = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[PickleStep]
    /**
      * Decodes a PickleStep message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns PickleStep
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decode(reader: Reader): PickleStep = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[PickleStep]
    inline def decode(reader: Reader, length: Double): PickleStep = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[PickleStep]
    
    inline def decodeDelimited(reader: js.typedarray.Uint8Array): PickleStep = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[PickleStep]
    /**
      * Decodes a PickleStep message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns PickleStep
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decodeDelimited(reader: Reader): PickleStep = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[PickleStep]
    
    /**
      * Encodes the specified PickleStep message. Does not implicitly {@link io.cucumber.messages.Pickle.PickleStep.verify|verify} messages.
      * @param message PickleStep message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encode(message: IPickleStep): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encode(message: IPickleStep, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Encodes the specified PickleStep message, length delimited. Does not implicitly {@link io.cucumber.messages.Pickle.PickleStep.verify|verify} messages.
      * @param message PickleStep message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encodeDelimited(message: IPickleStep): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encodeDelimited(message: IPickleStep, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Creates a PickleStep message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns PickleStep
      */
    /* static member */
    inline def fromObject(`object`: StringDictionary[Any]): PickleStep = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[PickleStep]
    
    /**
      * Creates a plain object from a PickleStep message. Also converts values to other types if specified.
      * @param message PickleStep
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    inline def toObject(message: PickleStep): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
    inline def toObject(message: PickleStep, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
    
    /**
      * Verifies a PickleStep message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  }
  
  /** A tag */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.Pickle.PickleTag")
  @js.native
  /**
    * Constructs a new PickleTag.
    * @param [properties] Properties to set
    */
  open class PickleTag ()
    extends StObject
       with IPickleTag {
    def this(properties: IPickleTag) = this()
    
    /** PickleTag astNodeId. */
    @JSName("astNodeId")
    var astNodeId_PickleTag: String = js.native
    
    /** PickleTag name. */
    @JSName("name")
    var name_PickleTag: String = js.native
    
    /**
      * Converts this PickleTag to JSON.
      * @returns JSON object
      */
    def toJSON(): StringDictionary[Any] = js.native
  }
  object PickleTag {
    
    @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.Pickle.PickleTag")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new PickleTag instance using the specified properties.
      * @param [properties] Properties to set
      * @returns PickleTag instance
      */
    /* static member */
    inline def create(): PickleTag = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[PickleTag]
    inline def create(properties: IPickleTag): PickleTag = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[PickleTag]
    
    inline def decode(reader: js.typedarray.Uint8Array): PickleTag = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[PickleTag]
    inline def decode(reader: js.typedarray.Uint8Array, length: Double): PickleTag = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[PickleTag]
    /**
      * Decodes a PickleTag message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns PickleTag
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decode(reader: Reader): PickleTag = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[PickleTag]
    inline def decode(reader: Reader, length: Double): PickleTag = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[PickleTag]
    
    inline def decodeDelimited(reader: js.typedarray.Uint8Array): PickleTag = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[PickleTag]
    /**
      * Decodes a PickleTag message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns PickleTag
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decodeDelimited(reader: Reader): PickleTag = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[PickleTag]
    
    /**
      * Encodes the specified PickleTag message. Does not implicitly {@link io.cucumber.messages.Pickle.PickleTag.verify|verify} messages.
      * @param message PickleTag message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encode(message: IPickleTag): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encode(message: IPickleTag, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Encodes the specified PickleTag message, length delimited. Does not implicitly {@link io.cucumber.messages.Pickle.PickleTag.verify|verify} messages.
      * @param message PickleTag message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encodeDelimited(message: IPickleTag): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encodeDelimited(message: IPickleTag, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Creates a PickleTag message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns PickleTag
      */
    /* static member */
    inline def fromObject(`object`: StringDictionary[Any]): PickleTag = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[PickleTag]
    
    /**
      * Creates a plain object from a PickleTag message. Also converts values to other types if specified.
      * @param message PickleTag
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    inline def toObject(message: PickleTag): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
    inline def toObject(message: PickleTag, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
    
    /**
      * Verifies a PickleTag message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  }
  
  /**
    * Creates a new Pickle instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Pickle instance
    */
  /* static member */
  inline def create(): Pickle = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Pickle]
  inline def create(properties: IPickle): Pickle = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[Pickle]
  
  inline def decode(reader: js.typedarray.Uint8Array): Pickle = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Pickle]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): Pickle = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Pickle]
  /**
    * Decodes a Pickle message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Pickle
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): Pickle = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Pickle]
  inline def decode(reader: Reader, length: Double): Pickle = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Pickle]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): Pickle = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Pickle]
  /**
    * Decodes a Pickle message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Pickle
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): Pickle = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Pickle]
  
  /**
    * Encodes the specified Pickle message. Does not implicitly {@link io.cucumber.messages.Pickle.verify|verify} messages.
    * @param message Pickle message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: IPickle): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IPickle, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified Pickle message, length delimited. Does not implicitly {@link io.cucumber.messages.Pickle.verify|verify} messages.
    * @param message Pickle message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: IPickle): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IPickle, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a Pickle message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Pickle
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): Pickle = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[Pickle]
  
  /**
    * Creates a plain object from a Pickle message. Also converts values to other types if specified.
    * @param message Pickle
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: Pickle): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: Pickle, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a Pickle message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  /** Properties of a PickleStep. */
  trait IPickleStep extends StObject {
    
    /** PickleStep argument */
    var argument: js.UndefOr[IPickleStepArgument | Null] = js.undefined
    
    /** PickleStep astNodeIds */
    var astNodeIds: js.UndefOr[js.Array[String] | Null] = js.undefined
    
    /** PickleStep id */
    var id: js.UndefOr[String | Null] = js.undefined
    
    /** PickleStep text */
    var text: js.UndefOr[String | Null] = js.undefined
  }
  object IPickleStep {
    
    inline def apply(): IPickleStep = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IPickleStep]
    }
    
    extension [Self <: IPickleStep](x: Self) {
      
      inline def setArgument(value: IPickleStepArgument): Self = StObject.set(x, "argument", value.asInstanceOf[js.Any])
      
      inline def setArgumentNull: Self = StObject.set(x, "argument", null)
      
      inline def setArgumentUndefined: Self = StObject.set(x, "argument", js.undefined)
      
      inline def setAstNodeIds(value: js.Array[String]): Self = StObject.set(x, "astNodeIds", value.asInstanceOf[js.Any])
      
      inline def setAstNodeIdsNull: Self = StObject.set(x, "astNodeIds", null)
      
      inline def setAstNodeIdsUndefined: Self = StObject.set(x, "astNodeIds", js.undefined)
      
      inline def setAstNodeIdsVarargs(value: String*): Self = StObject.set(x, "astNodeIds", js.Array(value*))
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdNull: Self = StObject.set(x, "id", null)
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextNull: Self = StObject.set(x, "text", null)
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  /** Properties of a PickleTag. */
  trait IPickleTag extends StObject {
    
    /** PickleTag astNodeId */
    var astNodeId: js.UndefOr[String | Null] = js.undefined
    
    /** PickleTag name */
    var name: js.UndefOr[String | Null] = js.undefined
  }
  object IPickleTag {
    
    inline def apply(): IPickleTag = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IPickleTag]
    }
    
    extension [Self <: IPickleTag](x: Self) {
      
      inline def setAstNodeId(value: String): Self = StObject.set(x, "astNodeId", value.asInstanceOf[js.Any])
      
      inline def setAstNodeIdNull: Self = StObject.set(x, "astNodeId", null)
      
      inline def setAstNodeIdUndefined: Self = StObject.set(x, "astNodeId", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameNull: Self = StObject.set(x, "name", null)
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
}
