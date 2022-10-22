package typingsJapgolly.protobufjs.extDescriptorMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.protobufjs.mod.AnyNestedObject
import typingsJapgolly.protobufjs.mod.Codegen
import typingsJapgolly.protobufjs.mod.Constructor
import typingsJapgolly.protobufjs.mod.Enum
import typingsJapgolly.protobufjs.mod.Field
import typingsJapgolly.protobufjs.mod.IConversionOptions
import typingsJapgolly.protobufjs.mod.INamespace
import typingsJapgolly.protobufjs.mod.IToJSONOptions
import typingsJapgolly.protobufjs.mod.IType
import typingsJapgolly.protobufjs.mod.Message
import typingsJapgolly.protobufjs.mod.Namespace
import typingsJapgolly.protobufjs.mod.OneOf
import typingsJapgolly.protobufjs.mod.Reader
import typingsJapgolly.protobufjs.mod.ReflectionObject
import typingsJapgolly.protobufjs.mod.Root
import typingsJapgolly.protobufjs.mod.Service
import typingsJapgolly.protobufjs.mod.Type
import typingsJapgolly.protobufjs.mod.TypeDecorator
import typingsJapgolly.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined protobufjs.protobufjs.Type & {  Annotation :protobufjs.protobufjs.Type} */
object GeneratedCodeInfo {
  
  @JSImport("protobufjs/ext/descriptor", "GeneratedCodeInfo")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("protobufjs/ext/descriptor", "GeneratedCodeInfo.Annotation")
  @js.native
  def Annotation: Type = js.native
  inline def Annotation_=(x: Type): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Annotation")(x.asInstanceOf[js.Any])
  
  /**
    * Adds a nested object to this type.
    * @param object Nested object to add
    * @returns `this`
    * @throws {TypeError} If arguments are invalid
    * @throws {Error} If there is already a nested object with this name or, if a field, when there is already a field with this id
    */
  inline def add(`object`: ReflectionObject): Type = ^.asInstanceOf[js.Dynamic].applyDynamic("add")(`object`.asInstanceOf[js.Any]).asInstanceOf[Type]
  
  /**
    * Adds nested objects to this namespace from nested object descriptors.
    * @param nestedJson Any nested object descriptors
    * @returns `this`
    */
  inline def addJSON(nestedJson: StringDictionary[AnyNestedObject]): Namespace = ^.asInstanceOf[js.Dynamic].applyDynamic("addJSON")(nestedJson.asInstanceOf[js.Any]).asInstanceOf[Namespace]
  
  /**
    * Adds a nested object to this namespace.
    * @param object Nested object to add
    * @returns `this`
    * @throws {TypeError} If arguments are invalid
    * @throws {Error} If there is already a nested object with this name
    */
  inline def add_Namespace(`object`: ReflectionObject): Namespace = ^.asInstanceOf[js.Dynamic].applyDynamic("add")(`object`.asInstanceOf[js.Any]).asInstanceOf[Namespace]
  
  /** Comment text, if any. */
  @JSImport("protobufjs/ext/descriptor", "GeneratedCodeInfo.comment")
  @js.native
  def comment: String | Null = js.native
  inline def comment_=(x: String | Null): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("comment")(x.asInstanceOf[js.Any])
  
  /**
    * Constructs a new reflected message type instance.
    * @param name Message name
    * @param [options] Declared options
    */
  inline def constructor(name: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("constructor")(name.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def constructor(name: String, options: StringDictionary[Any]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("constructor")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  /**
    * Creates a new message of this type using the specified properties.
    * @param [properties] Properties to set
    * @returns Message instance
    */
  inline def create(): Message[js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Message[js.Object]]
  inline def create(properties: StringDictionary[Any]): Message[js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[Message[js.Object]]
  
  /**
    * The registered constructor, if any registered, otherwise a generic constructor.
    * Assigning a function replaces the internal constructor. If the function does not extend {@link Message} yet, its prototype will be setup accordingly and static methods will be populated. If it already extends {@link Message}, it will just replace the internal constructor.
    */
  @JSImport("protobufjs/ext/descriptor", "GeneratedCodeInfo.ctor")
  @js.native
  def ctor: Constructor[js.Object] = js.native
  inline def ctor_=(x: Constructor[js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ctor")(x.asInstanceOf[js.Any])
  
  /**
    * Type decorator (TypeScript).
    * @param [typeName] Type name, defaults to the constructor's name
    * @returns Decorator function
    */
  inline def d[T /* <: Message[T] */](): TypeDecorator[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("d")().asInstanceOf[TypeDecorator[T]]
  inline def d[T /* <: Message[T] */](typeName: String): TypeDecorator[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("d")(typeName.asInstanceOf[js.Any]).asInstanceOf[TypeDecorator[T]]
  
  inline def decode(reader: js.typedarray.Uint8Array): Message[js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Message[js.Object]]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): Message[js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Message[js.Object]]
  /**
    * Decodes a message of this type.
    * @param reader Reader or buffer to decode from
    * @param [length] Length of the message, if known beforehand
    * @returns Decoded message
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {util.ProtocolError<{}>} If required fields are missing
    */
  inline def decode(reader: Reader): Message[js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Message[js.Object]]
  inline def decode(reader: Reader, length: Double): Message[js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Message[js.Object]]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): Message[js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Message[js.Object]]
  /**
    * Decodes a message of this type preceeded by its byte length as a varint.
    * @param reader Reader or buffer to decode from
    * @returns Decoded message
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {util.ProtocolError} If required fields are missing
    */
  inline def decodeDelimited(reader: Reader): Message[js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Message[js.Object]]
  
  /**
    * Defines additial namespaces within this one if not yet existing.
    * @param path Path to create
    * @param [json] Nested types to create from JSON
    * @returns Pointer to the last namespace created or `this` if path is empty
    */
  inline def define(path: String): Namespace = ^.asInstanceOf[js.Dynamic].applyDynamic("define")(path.asInstanceOf[js.Any]).asInstanceOf[Namespace]
  inline def define(path: String, json: Any): Namespace = (^.asInstanceOf[js.Dynamic].applyDynamic("define")(path.asInstanceOf[js.Any], json.asInstanceOf[js.Any])).asInstanceOf[Namespace]
  inline def define(path: js.Array[String]): Namespace = ^.asInstanceOf[js.Dynamic].applyDynamic("define")(path.asInstanceOf[js.Any]).asInstanceOf[Namespace]
  inline def define(path: js.Array[String], json: Any): Namespace = (^.asInstanceOf[js.Dynamic].applyDynamic("define")(path.asInstanceOf[js.Any], json.asInstanceOf[js.Any])).asInstanceOf[Namespace]
  
  inline def encode(message: StringDictionary[Any]): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: StringDictionary[Any], writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  /**
    * Encodes a message of this type. Does not implicitly {@link Type#verify|verify} messages.
    * @param message Message instance or plain object
    * @param [writer] Writer to encode to
    * @returns writer
    */
  inline def encode(message: Message[js.Object]): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: Message[js.Object], writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  inline def encodeDelimited(message: StringDictionary[Any]): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: StringDictionary[Any], writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  /**
    * Encodes a message of this type preceeded by its byte length as a varint. Does not implicitly {@link Type#verify|verify} messages.
    * @param message Message instance or plain object
    * @param [writer] Writer to encode to
    * @returns writer
    */
  inline def encodeDelimited(message: Message[js.Object]): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: Message[js.Object], writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /** Extension ranges, if any. */
  @JSImport("protobufjs/ext/descriptor", "GeneratedCodeInfo.extensions")
  @js.native
  def extensions: js.Array[js.Array[Double]] = js.native
  inline def extensions_=(x: js.Array[js.Array[Double]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
  
  /** Fields of this message as an array for iteration. */
  @JSImport("protobufjs/ext/descriptor", "GeneratedCodeInfo.fieldsArray")
  @js.native
  val fieldsArray: js.Array[Field] = js.native
  
  /** Defining file name. */
  @JSImport("protobufjs/ext/descriptor", "GeneratedCodeInfo.filename")
  @js.native
  def filename: String | Null = js.native
  inline def filename_=(x: String | Null): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("filename")(x.asInstanceOf[js.Any])
  
  /**
    * Creates a message type from a message type descriptor.
    * @param name Message name
    * @param json Message type descriptor
    * @returns Created message type
    */
  inline def fromJSON(name: String, json: IType): Type = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(name.asInstanceOf[js.Any], json.asInstanceOf[js.Any])).asInstanceOf[Type]
  
  /**
    * Creates a new message of this type from a plain object. Also converts values to their respective internal types.
    * @param object Plain object to convert
    * @returns Message instance
    */
  inline def fromObject(`object`: StringDictionary[Any]): Message[js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[Message[js.Object]]
  
  /** Full name including leading dot. */
  @JSImport("protobufjs/ext/descriptor", "GeneratedCodeInfo.fullName")
  @js.native
  val fullName: String = js.native
  
  /**
    * Generates a constructor function for the specified type.
    * @param mtype Message type
    * @returns Codegen instance
    */
  inline def generateConstructor(mtype: Type): Codegen = ^.asInstanceOf[js.Dynamic].applyDynamic("generateConstructor")(mtype.asInstanceOf[js.Any]).asInstanceOf[Codegen]
  
  /**
    * Gets the nested object of the specified name.
    * @param name Nested object name
    * @returns The reflection object or `null` if it doesn't exist
    */
  inline def get(name: String): ReflectionObject | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any]).asInstanceOf[ReflectionObject | Null]
  
  /**
    * Gets the values of the nested {@link Enum|enum} of the specified name.
    * This methods differs from {@link Namespace#get|get} in that it returns an enum's values directly and throws instead of returning `null`.
    * @param name Nested enum name
    * @returns Enum values
    * @throws {Error} If there is no such enum
    */
  inline def getEnum(name: String): StringDictionary[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("getEnum")(name.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Double]]
  
  /**
    * Gets an option value.
    * @param name Option name
    * @returns Option value or `undefined` if not set
    */
  inline def getOption(name: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getOption")(name.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  /**
    * Tests if the specified id is reserved.
    * @param id Id to test
    * @returns `true` if reserved, otherwise `false`
    */
  inline def isReservedId(id: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isReservedId")(id.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /**
    * Tests if the specified name is reserved.
    * @param name Name to test
    * @returns `true` if reserved, otherwise `false`
    */
  inline def isReservedName(name: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isReservedName")(name.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /**
    * Looks up the reflection object at the specified path, relative to this namespace.
    * @param path Path to look up
    * @param [parentAlreadyChecked=false] Whether the parent has already been checked
    * @returns Looked up object or `null` if none could be found
    */
  inline def lookup(path: String): ReflectionObject | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(path.asInstanceOf[js.Any]).asInstanceOf[ReflectionObject | Null]
  inline def lookup(path: String, filterTypes: js.Array[Any]): ReflectionObject | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(path.asInstanceOf[js.Any], filterTypes.asInstanceOf[js.Any])).asInstanceOf[ReflectionObject | Null]
  inline def lookup(path: String, filterTypes: js.Array[Any], parentAlreadyChecked: Boolean): ReflectionObject | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(path.asInstanceOf[js.Any], filterTypes.asInstanceOf[js.Any], parentAlreadyChecked.asInstanceOf[js.Any])).asInstanceOf[ReflectionObject | Null]
  /**
    * Recursively looks up the reflection object matching the specified path in the scope of this namespace.
    * @param path Path to look up
    * @param filterTypes Filter types, any combination of the constructors of `protobuf.Type`, `protobuf.Enum`, `protobuf.Service` etc.
    * @param [parentAlreadyChecked=false] If known, whether the parent has already been checked
    * @returns Looked up object or `null` if none could be found
    */
  inline def lookup(path: String, filterTypes: Any): ReflectionObject | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(path.asInstanceOf[js.Any], filterTypes.asInstanceOf[js.Any])).asInstanceOf[ReflectionObject | Null]
  inline def lookup(path: String, filterTypes: Any, parentAlreadyChecked: Boolean): ReflectionObject | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(path.asInstanceOf[js.Any], filterTypes.asInstanceOf[js.Any], parentAlreadyChecked.asInstanceOf[js.Any])).asInstanceOf[ReflectionObject | Null]
  inline def lookup(path: String, parentAlreadyChecked: Boolean): ReflectionObject | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(path.asInstanceOf[js.Any], parentAlreadyChecked.asInstanceOf[js.Any])).asInstanceOf[ReflectionObject | Null]
  inline def lookup(path: js.Array[String]): ReflectionObject | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(path.asInstanceOf[js.Any]).asInstanceOf[ReflectionObject | Null]
  inline def lookup(path: js.Array[String], filterTypes: js.Array[Any]): ReflectionObject | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(path.asInstanceOf[js.Any], filterTypes.asInstanceOf[js.Any])).asInstanceOf[ReflectionObject | Null]
  inline def lookup(path: js.Array[String], filterTypes: js.Array[Any], parentAlreadyChecked: Boolean): ReflectionObject | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(path.asInstanceOf[js.Any], filterTypes.asInstanceOf[js.Any], parentAlreadyChecked.asInstanceOf[js.Any])).asInstanceOf[ReflectionObject | Null]
  inline def lookup(path: js.Array[String], filterTypes: Any): ReflectionObject | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(path.asInstanceOf[js.Any], filterTypes.asInstanceOf[js.Any])).asInstanceOf[ReflectionObject | Null]
  inline def lookup(path: js.Array[String], filterTypes: Any, parentAlreadyChecked: Boolean): ReflectionObject | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(path.asInstanceOf[js.Any], filterTypes.asInstanceOf[js.Any], parentAlreadyChecked.asInstanceOf[js.Any])).asInstanceOf[ReflectionObject | Null]
  inline def lookup(path: js.Array[String], parentAlreadyChecked: Boolean): ReflectionObject | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(path.asInstanceOf[js.Any], parentAlreadyChecked.asInstanceOf[js.Any])).asInstanceOf[ReflectionObject | Null]
  
  /**
    * Looks up the values of the {@link Enum|enum} at the specified path, relative to this namespace.
    * Besides its signature, this methods differs from {@link Namespace#lookup|lookup} in that it throws instead of returning `null`.
    * @param path Path to look up
    * @returns Looked up enum
    * @throws {Error} If `path` does not point to an enum
    */
  inline def lookupEnum(path: String): Enum = ^.asInstanceOf[js.Dynamic].applyDynamic("lookupEnum")(path.asInstanceOf[js.Any]).asInstanceOf[Enum]
  inline def lookupEnum(path: js.Array[String]): Enum = ^.asInstanceOf[js.Dynamic].applyDynamic("lookupEnum")(path.asInstanceOf[js.Any]).asInstanceOf[Enum]
  
  /**
    * Looks up the {@link Service|service} at the specified path, relative to this namespace.
    * Besides its signature, this methods differs from {@link Namespace#lookup|lookup} in that it throws instead of returning `null`.
    * @param path Path to look up
    * @returns Looked up service
    * @throws {Error} If `path` does not point to a service
    */
  inline def lookupService(path: String): Service = ^.asInstanceOf[js.Dynamic].applyDynamic("lookupService")(path.asInstanceOf[js.Any]).asInstanceOf[Service]
  inline def lookupService(path: js.Array[String]): Service = ^.asInstanceOf[js.Dynamic].applyDynamic("lookupService")(path.asInstanceOf[js.Any]).asInstanceOf[Service]
  
  /**
    * Looks up the {@link Type|type} at the specified path, relative to this namespace.
    * Besides its signature, this methods differs from {@link Namespace#lookup|lookup} in that it throws instead of returning `null`.
    * @param path Path to look up
    * @returns Looked up type
    * @throws {Error} If `path` does not point to a type
    */
  inline def lookupType(path: String): Type = ^.asInstanceOf[js.Dynamic].applyDynamic("lookupType")(path.asInstanceOf[js.Any]).asInstanceOf[Type]
  inline def lookupType(path: js.Array[String]): Type = ^.asInstanceOf[js.Dynamic].applyDynamic("lookupType")(path.asInstanceOf[js.Any]).asInstanceOf[Type]
  
  /**
    * Looks up the {@link Type|type} or {@link Enum|enum} at the specified path, relative to this namespace.
    * Besides its signature, this methods differs from {@link Namespace#lookup|lookup} in that it throws instead of returning `null`.
    * @param path Path to look up
    * @returns Looked up type or enum
    * @throws {Error} If `path` does not point to a type or enum
    */
  inline def lookupTypeOrEnum(path: String): Type = ^.asInstanceOf[js.Dynamic].applyDynamic("lookupTypeOrEnum")(path.asInstanceOf[js.Any]).asInstanceOf[Type]
  inline def lookupTypeOrEnum(path: js.Array[String]): Type = ^.asInstanceOf[js.Dynamic].applyDynamic("lookupTypeOrEnum")(path.asInstanceOf[js.Any]).asInstanceOf[Type]
  
  /** Unique name within its namespace. */
  @JSImport("protobufjs/ext/descriptor", "GeneratedCodeInfo.name")
  @js.native
  def name: String = js.native
  inline def name_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("name")(x.asInstanceOf[js.Any])
  
  /** Nested objects by name. */
  @JSImport("protobufjs/ext/descriptor", "GeneratedCodeInfo.nested")
  @js.native
  def nested: js.UndefOr[StringDictionary[ReflectionObject]] = js.native
  
  /** Nested objects of this namespace as an array for iteration. */
  @JSImport("protobufjs/ext/descriptor", "GeneratedCodeInfo.nestedArray")
  @js.native
  val nestedArray: js.Array[ReflectionObject] = js.native
  
  inline def nested_=(x: js.UndefOr[StringDictionary[ReflectionObject]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nested")(x.asInstanceOf[js.Any])
  
  /**
    * Called when this object is added to a parent.
    * @param parent Parent added to
    */
  inline def onAdd(parent: ReflectionObject): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onAdd")(parent.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Called when this object is removed from a parent.
    * @param parent Parent removed from
    */
  inline def onRemove(parent: ReflectionObject): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onRemove")(parent.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** Oneofs of this message as an array for iteration. */
  @JSImport("protobufjs/ext/descriptor", "GeneratedCodeInfo.oneofsArray")
  @js.native
  val oneofsArray: js.Array[OneOf] = js.native
  
  /** Options. */
  @JSImport("protobufjs/ext/descriptor", "GeneratedCodeInfo.options")
  @js.native
  def options: js.UndefOr[StringDictionary[Any]] = js.native
  inline def options_=(x: js.UndefOr[StringDictionary[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("options")(x.asInstanceOf[js.Any])
  
  /** Parent namespace. */
  @JSImport("protobufjs/ext/descriptor", "GeneratedCodeInfo.parent")
  @js.native
  def parent: Namespace | Null = js.native
  inline def parent_=(x: Namespace | Null): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parent")(x.asInstanceOf[js.Any])
  
  /** Parsed Options. */
  @JSImport("protobufjs/ext/descriptor", "GeneratedCodeInfo.parsedOptions")
  @js.native
  def parsedOptions: js.UndefOr[StringDictionary[js.Array[Any]]] = js.native
  inline def parsedOptions_=(x: js.UndefOr[StringDictionary[js.Array[Any]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parsedOptions")(x.asInstanceOf[js.Any])
  
  /**
    * Removes a nested object from this type.
    * @param object Nested object to remove
    * @returns `this`
    * @throws {TypeError} If arguments are invalid
    * @throws {Error} If `object` is not a member of this type
    */
  inline def remove(`object`: ReflectionObject): Type = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")(`object`.asInstanceOf[js.Any]).asInstanceOf[Type]
  
  /**
    * Removes a nested object from this namespace.
    * @param object Nested object to remove
    * @returns `this`
    * @throws {TypeError} If arguments are invalid
    * @throws {Error} If `object` is not a member of this namespace
    */
  inline def remove_Namespace(`object`: ReflectionObject): Namespace = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")(`object`.asInstanceOf[js.Any]).asInstanceOf[Namespace]
  
  /** Reserved ranges, if any. */
  @JSImport("protobufjs/ext/descriptor", "GeneratedCodeInfo.reserved")
  @js.native
  def reserved: js.Array[js.Array[Double] | String] = js.native
  inline def reserved_=(x: js.Array[js.Array[Double] | String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("reserved")(x.asInstanceOf[js.Any])
  
  /**
    * Resolves this objects type references.
    * @returns `this`
    */
  inline def resolve(): ReflectionObject = ^.asInstanceOf[js.Dynamic].applyDynamic("resolve")().asInstanceOf[ReflectionObject]
  
  /**
    * Resolves this namespace's and all its nested objects' type references. Useful to validate a reflection tree, but comes at a cost.
    * @returns `this`
    */
  inline def resolveAll(): Namespace = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveAll")().asInstanceOf[Namespace]
  
  /** Whether already resolved or not. */
  @JSImport("protobufjs/ext/descriptor", "GeneratedCodeInfo.resolved")
  @js.native
  def resolved: Boolean = js.native
  inline def resolved_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("resolved")(x.asInstanceOf[js.Any])
  
  /** Reference to the root namespace. */
  @JSImport("protobufjs/ext/descriptor", "GeneratedCodeInfo.root")
  @js.native
  val root: Root = js.native
  
  /**
    * Sets an option.
    * @param name Option name
    * @param value Option value
    * @param [ifNotSet] Sets the option only if it isn't currently set
    * @returns `this`
    */
  inline def setOption(name: String, value: Any): ReflectionObject = (^.asInstanceOf[js.Dynamic].applyDynamic("setOption")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[ReflectionObject]
  inline def setOption(name: String, value: Any, ifNotSet: Boolean): ReflectionObject = (^.asInstanceOf[js.Dynamic].applyDynamic("setOption")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any], ifNotSet.asInstanceOf[js.Any])).asInstanceOf[ReflectionObject]
  
  /**
    * Sets multiple options.
    * @param options Options to set
    * @param [ifNotSet] Sets an option only if it isn't currently set
    * @returns `this`
    */
  inline def setOptions(options: StringDictionary[Any]): ReflectionObject = ^.asInstanceOf[js.Dynamic].applyDynamic("setOptions")(options.asInstanceOf[js.Any]).asInstanceOf[ReflectionObject]
  inline def setOptions(options: StringDictionary[Any], ifNotSet: Boolean): ReflectionObject = (^.asInstanceOf[js.Dynamic].applyDynamic("setOptions")(options.asInstanceOf[js.Any], ifNotSet.asInstanceOf[js.Any])).asInstanceOf[ReflectionObject]
  
  /**
    * Sets a parsed option.
    * @param name parsed Option name
    * @param value Option value
    * @param propName dot '.' delimited full path of property within the option to set. if undefined\empty, will add a new option with that value
    * @returns `this`
    */
  inline def setParsedOption(name: String, value: Any, propName: String): ReflectionObject = (^.asInstanceOf[js.Dynamic].applyDynamic("setParsedOption")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any], propName.asInstanceOf[js.Any])).asInstanceOf[ReflectionObject]
  
  /**
    * Sets up {@link Type#encode|encode}, {@link Type#decode|decode} and {@link Type#verify|verify}.
    * @returns `this`
    */
  inline def setup(): Type = ^.asInstanceOf[js.Dynamic].applyDynamic("setup")().asInstanceOf[Type]
  
  /**
    * Converts this namespace to a namespace descriptor.
    * @param [toJSONOptions] JSON conversion options
    * @returns Namespace descriptor
    */
  inline def toJSON(): INamespace = ^.asInstanceOf[js.Dynamic].applyDynamic("toJSON")().asInstanceOf[INamespace]
  inline def toJSON(toJSONOptions: IToJSONOptions): INamespace = ^.asInstanceOf[js.Dynamic].applyDynamic("toJSON")(toJSONOptions.asInstanceOf[js.Any]).asInstanceOf[INamespace]
  
  /**
    * Converts this message type to a message type descriptor.
    * @param [toJSONOptions] JSON conversion options
    * @returns Message type descriptor
    */
  inline def toJSON_IType(): IType = ^.asInstanceOf[js.Dynamic].applyDynamic("toJSON")().asInstanceOf[IType]
  inline def toJSON_IType(toJSONOptions: IToJSONOptions): IType = ^.asInstanceOf[js.Dynamic].applyDynamic("toJSON")(toJSONOptions.asInstanceOf[js.Any]).asInstanceOf[IType]
  
  /**
    * Converts this reflection object to its descriptor representation.
    * @returns Descriptor
    */
  inline def toJSON_StringDictionary(): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toJSON")().asInstanceOf[StringDictionary[Any]]
  
  /**
    * Creates a plain object from a message of this type. Also converts values to other types if specified.
    * @param message Message instance
    * @param [options] Conversion options
    * @returns Plain object
    */
  inline def toObject(message: Message[js.Object]): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: Message[js.Object], options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Converts this instance to its string representation.
    * @returns Class name[, space, full name]
    */
  inline def toString_(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toString")().asInstanceOf[String]
  
  /**
    * Verifies that field values are valid and that required fields are present.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  inline def verify(message: StringDictionary[Any]): Null | String = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[Null | String]
}
