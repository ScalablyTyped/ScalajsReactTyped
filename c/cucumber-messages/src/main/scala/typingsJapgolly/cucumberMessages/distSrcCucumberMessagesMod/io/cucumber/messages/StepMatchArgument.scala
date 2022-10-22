package typingsJapgolly.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.protobufjs.mod.IConversionOptions
import typingsJapgolly.protobufjs.mod.Reader
import typingsJapgolly.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a single argument extracted from a step match and passed to a step definition.
  * This is used for the following purposes:
  * - Construct an argument to pass to a step definition (possibly through a parameter type transform)
  * - Highlight the matched parameter in rich formatters such as the HTML formatter
  *
  * This message closely matches the `Argument` class in the `cucumber-expressions` library.
  */
@JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.StepMatchArgument")
@js.native
/**
  * Constructs a new StepMatchArgument.
  * @param [properties] Properties to set
  */
open class StepMatchArgument ()
  extends StObject
     with IStepMatchArgument {
  def this(properties: IStepMatchArgument) = this()
  
  /** StepMatchArgument parameterTypeName. */
  @JSName("parameterTypeName")
  var parameterTypeName_StepMatchArgument: String = js.native
  
  /**
    * Converts this StepMatchArgument to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object StepMatchArgument {
  
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.StepMatchArgument")
  @js.native
  val ^ : js.Any = js.native
  
  /** Represents a Group. */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.StepMatchArgument.Group")
  @js.native
  /**
    * Constructs a new Group.
    * @param [properties] Properties to set
    */
  open class Group ()
    extends StObject
       with IGroup {
    def this(properties: IGroup) = this()
    
    /** Group children. */
    @JSName("children")
    var children_Group: js.Array[IGroup] = js.native
    
    /** Group start. */
    @JSName("start")
    var start_Group: Double = js.native
    
    /**
      * Converts this Group to JSON.
      * @returns JSON object
      */
    def toJSON(): StringDictionary[Any] = js.native
    
    /** Group value. */
    @JSName("value")
    var value_Group: String = js.native
  }
  object Group {
    
    @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.StepMatchArgument.Group")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new Group instance using the specified properties.
      * @param [properties] Properties to set
      * @returns Group instance
      */
    /* static member */
    inline def create(): Group = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Group]
    inline def create(properties: IGroup): Group = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[Group]
    
    inline def decode(reader: js.typedarray.Uint8Array): Group = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Group]
    inline def decode(reader: js.typedarray.Uint8Array, length: Double): Group = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Group]
    /**
      * Decodes a Group message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns Group
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decode(reader: Reader): Group = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Group]
    inline def decode(reader: Reader, length: Double): Group = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Group]
    
    inline def decodeDelimited(reader: js.typedarray.Uint8Array): Group = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Group]
    /**
      * Decodes a Group message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns Group
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decodeDelimited(reader: Reader): Group = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Group]
    
    /**
      * Encodes the specified Group message. Does not implicitly {@link io.cucumber.messages.StepMatchArgument.Group.verify|verify} messages.
      * @param message Group message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encode(message: IGroup): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encode(message: IGroup, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Encodes the specified Group message, length delimited. Does not implicitly {@link io.cucumber.messages.StepMatchArgument.Group.verify|verify} messages.
      * @param message Group message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encodeDelimited(message: IGroup): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encodeDelimited(message: IGroup, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Creates a Group message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns Group
      */
    /* static member */
    inline def fromObject(`object`: StringDictionary[Any]): Group = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[Group]
    
    /**
      * Creates a plain object from a Group message. Also converts values to other types if specified.
      * @param message Group
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    inline def toObject(message: Group): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
    inline def toObject(message: Group, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
    
    /**
      * Verifies a Group message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  }
  
  /**
    * Creates a new StepMatchArgument instance using the specified properties.
    * @param [properties] Properties to set
    * @returns StepMatchArgument instance
    */
  /* static member */
  inline def create(): StepMatchArgument = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[StepMatchArgument]
  inline def create(properties: IStepMatchArgument): StepMatchArgument = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[StepMatchArgument]
  
  inline def decode(reader: js.typedarray.Uint8Array): StepMatchArgument = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[StepMatchArgument]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): StepMatchArgument = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[StepMatchArgument]
  /**
    * Decodes a StepMatchArgument message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns StepMatchArgument
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): StepMatchArgument = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[StepMatchArgument]
  inline def decode(reader: Reader, length: Double): StepMatchArgument = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[StepMatchArgument]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): StepMatchArgument = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[StepMatchArgument]
  /**
    * Decodes a StepMatchArgument message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns StepMatchArgument
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): StepMatchArgument = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[StepMatchArgument]
  
  /**
    * Encodes the specified StepMatchArgument message. Does not implicitly {@link io.cucumber.messages.StepMatchArgument.verify|verify} messages.
    * @param message StepMatchArgument message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: IStepMatchArgument): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IStepMatchArgument, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified StepMatchArgument message, length delimited. Does not implicitly {@link io.cucumber.messages.StepMatchArgument.verify|verify} messages.
    * @param message StepMatchArgument message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: IStepMatchArgument): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IStepMatchArgument, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a StepMatchArgument message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns StepMatchArgument
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): StepMatchArgument = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[StepMatchArgument]
  
  /**
    * Creates a plain object from a StepMatchArgument message. Also converts values to other types if specified.
    * @param message StepMatchArgument
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: StepMatchArgument): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: StepMatchArgument, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a StepMatchArgument message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  /** Properties of a Group. */
  trait IGroup extends StObject {
    
    /** Group children */
    var children: js.UndefOr[js.Array[IGroup] | Null] = js.undefined
    
    /** Group start */
    var start: js.UndefOr[Double | Null] = js.undefined
    
    /** Group value */
    var value: js.UndefOr[String | Null] = js.undefined
  }
  object IGroup {
    
    inline def apply(): IGroup = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IGroup]
    }
    
    extension [Self <: IGroup](x: Self) {
      
      inline def setChildren(value: js.Array[IGroup]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: IGroup*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setStartNull: Self = StObject.set(x, "start", null)
      
      inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueNull: Self = StObject.set(x, "value", null)
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
