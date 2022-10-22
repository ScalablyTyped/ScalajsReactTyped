package typingsJapgolly.webgme

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.Storage
import typingsJapgolly.webgme.Global_.GmeLogger
import typingsJapgolly.webgme.GmeCommon.Aspect
import typingsJapgolly.webgme.GmeCommon.AttrMeta
import typingsJapgolly.webgme.GmeCommon.CrosscutsInfo
import typingsJapgolly.webgme.GmeCommon.Dictionary
import typingsJapgolly.webgme.GmeCommon.MemberId
import typingsJapgolly.webgme.GmeCommon.Metadata
import typingsJapgolly.webgme.GmeCommon.Name
import typingsJapgolly.webgme.GmeCommon.NodeId
import typingsJapgolly.webgme.GmeCommon.OutAttr
import typingsJapgolly.webgme.GmeCommon.Path
import typingsJapgolly.webgme.GmeCommon.Pointer
import typingsJapgolly.webgme.GmeCommon.Registry
import typingsJapgolly.webgme.GmeCommon.RelId
import typingsJapgolly.webgme.GmeCommon.ResultCallback
import typingsJapgolly.webgme.GmeCommon.SetId
import typingsJapgolly.webgme.webgmeStrings.`aspect collision`
import typingsJapgolly.webgme.webgmeStrings.`attribute collision`
import typingsJapgolly.webgme.webgmeStrings.`constraint collision`
import typingsJapgolly.webgme.webgmeStrings.`containment collision`
import typingsJapgolly.webgme.webgmeStrings.`pointer collision`
import typingsJapgolly.webgme.webgmeStrings.`set collision`
import typingsJapgolly.webgme.webgmeStrings.error
import typingsJapgolly.webgme.webgmeStrings.missing
import typingsJapgolly.webgme.webgmeStrings.warning
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This class defines the public API of the WebGME-Core
  * https://editor.dev.webgme.org/docs/source/module-Core.html
  */
object Core {
  
  trait Constraint extends StObject {
    
    /** Short description of the constraint. */
    var info: String
    
    /** Gives instructions on how to deal with violations of the constraint. */
    var priority: Double
    
    /** The script which checks if the constraint is met. */
    var script: String
  }
  object Constraint {
    
    inline def apply(info: String, priority: Double, script: String): Constraint = {
      val __obj = js.Dynamic.literal(info = info.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], script = script.asInstanceOf[js.Any])
      __obj.asInstanceOf[Constraint]
    }
    
    extension [Self <: Constraint](x: Self) {
      
      inline def setInfo(value: String): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      inline def setScript(value: String): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
    }
  }
  
  type DataObject = Any
  
  type GUID = String
  
  trait GmePersisted extends StObject {
    
    var objects: StringDictionary[DataObject]
    
    var rootHash: ObjectHash
  }
  object GmePersisted {
    
    inline def apply(objects: StringDictionary[DataObject], rootHash: ObjectHash): GmePersisted = {
      val __obj = js.Dynamic.literal(objects = objects.asInstanceOf[js.Any], rootHash = rootHash.asInstanceOf[js.Any])
      __obj.asInstanceOf[GmePersisted]
    }
    
    extension [Self <: GmePersisted](x: Self) {
      
      inline def setObjects(value: StringDictionary[DataObject]): Self = StObject.set(x, "objects", value.asInstanceOf[js.Any])
      
      inline def setRootHash(value: ObjectHash): Self = StObject.set(x, "rootHash", value.asInstanceOf[js.Any])
    }
  }
  
  trait MixinViolation extends StObject {
    
    /** The colliding mixin nodes (if any). */
    var collisionNodes: js.UndefOr[js.Array[Node]] = js.undefined
    
    /** The list of paths of colliding nodes (if any). */
    var collisionPaths: js.UndefOr[js.Array[String]] = js.undefined
    
    /** Hint on how to resolve the issue. */
    var hint: js.UndefOr[String] = js.undefined
    
    /** The description of the violation. */
    var message: js.UndefOr[String] = js.undefined
    
    /** The name of the affected rule definition (if available). */
    var ruleName: js.UndefOr[String] = js.undefined
    
    /** The severity of the given error. */
    var severity: js.UndefOr[error | warning] = js.undefined
    
    /** The name of the affected rule definition (if available). */
    var targetInfo: js.UndefOr[String] = js.undefined
    
    /** The target node of the violation (if available). */
    var targetNode: js.UndefOr[Node] = js.undefined
    
    /** What kind of violation */
    var `type`: js.UndefOr[
        missing | (`attribute collision`) | (`set collision`) | (`pointer collision`) | (`containment collision`) | (`aspect collision`) | (`constraint collision`)
      ] = js.undefined
  }
  object MixinViolation {
    
    inline def apply(): MixinViolation = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MixinViolation]
    }
    
    extension [Self <: MixinViolation](x: Self) {
      
      inline def setCollisionNodes(value: js.Array[Node]): Self = StObject.set(x, "collisionNodes", value.asInstanceOf[js.Any])
      
      inline def setCollisionNodesUndefined: Self = StObject.set(x, "collisionNodes", js.undefined)
      
      inline def setCollisionNodesVarargs(value: Node*): Self = StObject.set(x, "collisionNodes", js.Array(value*))
      
      inline def setCollisionPaths(value: js.Array[String]): Self = StObject.set(x, "collisionPaths", value.asInstanceOf[js.Any])
      
      inline def setCollisionPathsUndefined: Self = StObject.set(x, "collisionPaths", js.undefined)
      
      inline def setCollisionPathsVarargs(value: String*): Self = StObject.set(x, "collisionPaths", js.Array(value*))
      
      inline def setHint(value: String): Self = StObject.set(x, "hint", value.asInstanceOf[js.Any])
      
      inline def setHintUndefined: Self = StObject.set(x, "hint", js.undefined)
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setRuleName(value: String): Self = StObject.set(x, "ruleName", value.asInstanceOf[js.Any])
      
      inline def setRuleNameUndefined: Self = StObject.set(x, "ruleName", js.undefined)
      
      inline def setSeverity(value: error | warning): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
      
      inline def setSeverityUndefined: Self = StObject.set(x, "severity", js.undefined)
      
      inline def setTargetInfo(value: String): Self = StObject.set(x, "targetInfo", value.asInstanceOf[js.Any])
      
      inline def setTargetInfoUndefined: Self = StObject.set(x, "targetInfo", js.undefined)
      
      inline def setTargetNode(value: Node): Self = StObject.set(x, "targetNode", value.asInstanceOf[js.Any])
      
      inline def setTargetNodeUndefined: Self = StObject.set(x, "targetNode", js.undefined)
      
      inline def setType(
        value: missing | (`attribute collision`) | (`set collision`) | (`pointer collision`) | (`containment collision`) | (`aspect collision`) | (`constraint collision`)
      ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait Node extends StObject {
    
    var _id: String
    
    def canSetAsMixin(mixinPath: Path): Boolean
    
    def getAspectMeta(): Metadata
    
    def getAttribute(name: Name): OutAttr
    
    def getAttributeMeta(name: Name): AttrMeta
    
    def getAttributeNames(): js.Array[Name]
    
    def getBaseId(): NodeId
    
    def getBaseTypeId(): Node | Null
    
    def getChildrenIds(): js.Array[NodeId]
    
    def getCollectionPaths(name: Name): js.Array[Path]
    
    def getConstraint(name: Name): Constraint
    
    def getConstraintNames(): js.Array[Name]
    
    def getCrosscutsInfo(): CrosscutsInfo
    
    def getEditableAttribute(name: Name): OutAttr
    
    def getEditableMemberAttribute(setId: SetId, memberId: MemberId, name: Name): OutAttr
    
    def getEditableMemberRegistry(setId: SetId, memberId: MemberId, name: Name): Registry
    
    def getEditableRegistry(name: Name): Registry
    
    def getFullyQualifiedName(): Name
    
    def getGuid(): GUID
    
    def getId(): NodeId
    
    def getInheritorIds(): js.Array[NodeId]
    
    def getInstancePaths(): js.Array[Path]
    
    def getJsonMeta(): js.Array[Metadata]
    
    def getLibraryGuid(): GUID
    
    def getMemberAttribute(setId: SetId, memberId: MemberId): OutAttr
    
    def getMemberAttributeNames(setId: SetId, memberId: MemberId): js.Array[Name]
    
    /** Set */
    def getMemberIds(setId: SetId): js.Array[Path]
    
    def getMemberRegistry(setId: SetId, memberId: MemberId, name: Name): Registry
    
    def getMemberRegistryNames(setId: SetId, memberId: MemberId): js.Array[Name]
    
    def getMetaTypeId(): Node | Null
    
    /** MixIns */
    def getMixinPaths(): js.Array[Path]
    
    def getNamespace(): Name
    
    def getNode(id: NodeId, logger: GmeLogger, state: Any, storeNode: ResultCallback[Storage]): Node
    
    def getOwnAttribute(name: Name): OutAttr
    
    def getOwnAttributeNames(): js.Array[Name]
    
    def getOwnConstraintNames(): js.Array[Name]
    
    def getOwnEditableAttribute(name: Name): OutAttr
    
    def getOwnEditableRegistry(name: Name): Registry
    
    def getOwnPointer(name: Name): Pointer
    
    def getOwnPointerId(name: Name): SetId
    
    def getOwnPointerNames(): js.Array[Name]
    
    def getOwnRegistry(name: Name): Registry
    
    def getOwnRegistryNames(): js.Array[Name]
    
    def getOwnValidAspectNames(): js.Array[Name]
    
    def getOwnValidAttributeNames(): js.Array[Name]
    
    def getParentId(): NodeId
    
    def getPointer(name: Name): Pointer
    
    def getPointerId(name: Name): SetId
    
    def getPointerNames(): js.Array[Name]
    
    def getRegistry(name: Name): Registry
    
    def getRegistryNames(): js.Array[Name]
    
    def getRelid(): RelId
    
    def getSetNames(): js.Array[Name]
    
    def getValidAspectNames(): js.Array[Name]
    
    def getValidAttributeNames(): js.Array[Name]
    
    def getValidChildrenIds(): js.Array[NodeId]
    
    /** META */
    def getValidChildrenTypes(): js.Array[NodeId]
    
    def getValidChildrenTypesDetailed(aspect: Aspect, noFilter: Boolean): Dictionary[Any]
    
    def getValidPointerNames(): js.Array[Name]
    
    def getValidSetMemberTypesDetailed(setName: Name): StringDictionary[Any]
    
    def getValidSetNames(): js.Array[Name]
    
    def getValildAttributeNames(): js.Array[Name]
    
    def isAbstract(): Boolean
    
    def isConnection(): Boolean
    
    def isLibraryElement(): Boolean
    
    def isLibraryRoot(): Boolean
    
    def isMetaNode(): Boolean
    
    def isReadOnly(): Boolean
    
    def isTypeOf(typePath: Path): Boolean
    
    def isValidAttributeValueOf(name: Name, value: Any): Boolean
    
    def isValidChildOf(parentPath: Path): Boolean
    
    def isValidNewBase(basePath: Path): Boolean
    
    def isValidNewParent(parentPath: Path): Boolean
    
    def isValidTargetOf(sourcePath: Path, name: Name): Boolean
  }
  object Node {
    
    inline def apply(
      _id: String,
      canSetAsMixin: Path => Boolean,
      getAspectMeta: CallbackTo[Metadata],
      getAttribute: Name => OutAttr,
      getAttributeMeta: Name => AttrMeta,
      getAttributeNames: CallbackTo[js.Array[Name]],
      getBaseId: CallbackTo[NodeId],
      getBaseTypeId: CallbackTo[Node | Null],
      getChildrenIds: CallbackTo[js.Array[NodeId]],
      getCollectionPaths: Name => js.Array[Path],
      getConstraint: Name => Constraint,
      getConstraintNames: CallbackTo[js.Array[Name]],
      getCrosscutsInfo: CallbackTo[CrosscutsInfo],
      getEditableAttribute: Name => OutAttr,
      getEditableMemberAttribute: (SetId, MemberId, Name) => OutAttr,
      getEditableMemberRegistry: (SetId, MemberId, Name) => Registry,
      getEditableRegistry: Name => Registry,
      getFullyQualifiedName: CallbackTo[Name],
      getGuid: CallbackTo[GUID],
      getId: CallbackTo[NodeId],
      getInheritorIds: CallbackTo[js.Array[NodeId]],
      getInstancePaths: CallbackTo[js.Array[Path]],
      getJsonMeta: CallbackTo[js.Array[Metadata]],
      getLibraryGuid: CallbackTo[GUID],
      getMemberAttribute: (SetId, MemberId) => OutAttr,
      getMemberAttributeNames: (SetId, MemberId) => js.Array[Name],
      getMemberIds: SetId => js.Array[Path],
      getMemberRegistry: (SetId, MemberId, Name) => Registry,
      getMemberRegistryNames: (SetId, MemberId) => js.Array[Name],
      getMetaTypeId: CallbackTo[Node | Null],
      getMixinPaths: CallbackTo[js.Array[Path]],
      getNamespace: CallbackTo[Name],
      getNode: (NodeId, GmeLogger, Any, ResultCallback[Storage]) => Node,
      getOwnAttribute: Name => OutAttr,
      getOwnAttributeNames: CallbackTo[js.Array[Name]],
      getOwnConstraintNames: CallbackTo[js.Array[Name]],
      getOwnEditableAttribute: Name => OutAttr,
      getOwnEditableRegistry: Name => Registry,
      getOwnPointer: Name => Pointer,
      getOwnPointerId: Name => SetId,
      getOwnPointerNames: CallbackTo[js.Array[Name]],
      getOwnRegistry: Name => Registry,
      getOwnRegistryNames: CallbackTo[js.Array[Name]],
      getOwnValidAspectNames: CallbackTo[js.Array[Name]],
      getOwnValidAttributeNames: CallbackTo[js.Array[Name]],
      getParentId: CallbackTo[NodeId],
      getPointer: Name => Pointer,
      getPointerId: Name => SetId,
      getPointerNames: CallbackTo[js.Array[Name]],
      getRegistry: Name => Registry,
      getRegistryNames: CallbackTo[js.Array[Name]],
      getRelid: CallbackTo[RelId],
      getSetNames: CallbackTo[js.Array[Name]],
      getValidAspectNames: CallbackTo[js.Array[Name]],
      getValidAttributeNames: CallbackTo[js.Array[Name]],
      getValidChildrenIds: CallbackTo[js.Array[NodeId]],
      getValidChildrenTypes: CallbackTo[js.Array[NodeId]],
      getValidChildrenTypesDetailed: (Aspect, Boolean) => Dictionary[Any],
      getValidPointerNames: CallbackTo[js.Array[Name]],
      getValidSetMemberTypesDetailed: Name => StringDictionary[Any],
      getValidSetNames: CallbackTo[js.Array[Name]],
      getValildAttributeNames: CallbackTo[js.Array[Name]],
      isAbstract: CallbackTo[Boolean],
      isConnection: CallbackTo[Boolean],
      isLibraryElement: CallbackTo[Boolean],
      isLibraryRoot: CallbackTo[Boolean],
      isMetaNode: CallbackTo[Boolean],
      isReadOnly: CallbackTo[Boolean],
      isTypeOf: Path => Boolean,
      isValidAttributeValueOf: (Name, Any) => Boolean,
      isValidChildOf: Path => Boolean,
      isValidNewBase: Path => Boolean,
      isValidNewParent: Path => Boolean,
      isValidTargetOf: (Path, Name) => Boolean
    ): Node = {
      val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], canSetAsMixin = js.Any.fromFunction1(canSetAsMixin), getAspectMeta = getAspectMeta.toJsFn, getAttribute = js.Any.fromFunction1(getAttribute), getAttributeMeta = js.Any.fromFunction1(getAttributeMeta), getAttributeNames = getAttributeNames.toJsFn, getBaseId = getBaseId.toJsFn, getBaseTypeId = getBaseTypeId.toJsFn, getChildrenIds = getChildrenIds.toJsFn, getCollectionPaths = js.Any.fromFunction1(getCollectionPaths), getConstraint = js.Any.fromFunction1(getConstraint), getConstraintNames = getConstraintNames.toJsFn, getCrosscutsInfo = getCrosscutsInfo.toJsFn, getEditableAttribute = js.Any.fromFunction1(getEditableAttribute), getEditableMemberAttribute = js.Any.fromFunction3(getEditableMemberAttribute), getEditableMemberRegistry = js.Any.fromFunction3(getEditableMemberRegistry), getEditableRegistry = js.Any.fromFunction1(getEditableRegistry), getFullyQualifiedName = getFullyQualifiedName.toJsFn, getGuid = getGuid.toJsFn, getId = getId.toJsFn, getInheritorIds = getInheritorIds.toJsFn, getInstancePaths = getInstancePaths.toJsFn, getJsonMeta = getJsonMeta.toJsFn, getLibraryGuid = getLibraryGuid.toJsFn, getMemberAttribute = js.Any.fromFunction2(getMemberAttribute), getMemberAttributeNames = js.Any.fromFunction2(getMemberAttributeNames), getMemberIds = js.Any.fromFunction1(getMemberIds), getMemberRegistry = js.Any.fromFunction3(getMemberRegistry), getMemberRegistryNames = js.Any.fromFunction2(getMemberRegistryNames), getMetaTypeId = getMetaTypeId.toJsFn, getMixinPaths = getMixinPaths.toJsFn, getNamespace = getNamespace.toJsFn, getNode = js.Any.fromFunction4(getNode), getOwnAttribute = js.Any.fromFunction1(getOwnAttribute), getOwnAttributeNames = getOwnAttributeNames.toJsFn, getOwnConstraintNames = getOwnConstraintNames.toJsFn, getOwnEditableAttribute = js.Any.fromFunction1(getOwnEditableAttribute), getOwnEditableRegistry = js.Any.fromFunction1(getOwnEditableRegistry), getOwnPointer = js.Any.fromFunction1(getOwnPointer), getOwnPointerId = js.Any.fromFunction1(getOwnPointerId), getOwnPointerNames = getOwnPointerNames.toJsFn, getOwnRegistry = js.Any.fromFunction1(getOwnRegistry), getOwnRegistryNames = getOwnRegistryNames.toJsFn, getOwnValidAspectNames = getOwnValidAspectNames.toJsFn, getOwnValidAttributeNames = getOwnValidAttributeNames.toJsFn, getParentId = getParentId.toJsFn, getPointer = js.Any.fromFunction1(getPointer), getPointerId = js.Any.fromFunction1(getPointerId), getPointerNames = getPointerNames.toJsFn, getRegistry = js.Any.fromFunction1(getRegistry), getRegistryNames = getRegistryNames.toJsFn, getRelid = getRelid.toJsFn, getSetNames = getSetNames.toJsFn, getValidAspectNames = getValidAspectNames.toJsFn, getValidAttributeNames = getValidAttributeNames.toJsFn, getValidChildrenIds = getValidChildrenIds.toJsFn, getValidChildrenTypes = getValidChildrenTypes.toJsFn, getValidChildrenTypesDetailed = js.Any.fromFunction2(getValidChildrenTypesDetailed), getValidPointerNames = getValidPointerNames.toJsFn, getValidSetMemberTypesDetailed = js.Any.fromFunction1(getValidSetMemberTypesDetailed), getValidSetNames = getValidSetNames.toJsFn, getValildAttributeNames = getValildAttributeNames.toJsFn, isAbstract = isAbstract.toJsFn, isConnection = isConnection.toJsFn, isLibraryElement = isLibraryElement.toJsFn, isLibraryRoot = isLibraryRoot.toJsFn, isMetaNode = isMetaNode.toJsFn, isReadOnly = isReadOnly.toJsFn, isTypeOf = js.Any.fromFunction1(isTypeOf), isValidAttributeValueOf = js.Any.fromFunction2(isValidAttributeValueOf), isValidChildOf = js.Any.fromFunction1(isValidChildOf), isValidNewBase = js.Any.fromFunction1(isValidNewBase), isValidNewParent = js.Any.fromFunction1(isValidNewParent), isValidTargetOf = js.Any.fromFunction2(isValidTargetOf))
      __obj.asInstanceOf[Node]
    }
    
    extension [Self <: Node](x: Self) {
      
      inline def setCanSetAsMixin(value: Path => Boolean): Self = StObject.set(x, "canSetAsMixin", js.Any.fromFunction1(value))
      
      inline def setGetAspectMeta(value: CallbackTo[Metadata]): Self = StObject.set(x, "getAspectMeta", value.toJsFn)
      
      inline def setGetAttribute(value: Name => OutAttr): Self = StObject.set(x, "getAttribute", js.Any.fromFunction1(value))
      
      inline def setGetAttributeMeta(value: Name => AttrMeta): Self = StObject.set(x, "getAttributeMeta", js.Any.fromFunction1(value))
      
      inline def setGetAttributeNames(value: CallbackTo[js.Array[Name]]): Self = StObject.set(x, "getAttributeNames", value.toJsFn)
      
      inline def setGetBaseId(value: CallbackTo[NodeId]): Self = StObject.set(x, "getBaseId", value.toJsFn)
      
      inline def setGetBaseTypeId(value: CallbackTo[Node | Null]): Self = StObject.set(x, "getBaseTypeId", value.toJsFn)
      
      inline def setGetChildrenIds(value: CallbackTo[js.Array[NodeId]]): Self = StObject.set(x, "getChildrenIds", value.toJsFn)
      
      inline def setGetCollectionPaths(value: Name => js.Array[Path]): Self = StObject.set(x, "getCollectionPaths", js.Any.fromFunction1(value))
      
      inline def setGetConstraint(value: Name => Constraint): Self = StObject.set(x, "getConstraint", js.Any.fromFunction1(value))
      
      inline def setGetConstraintNames(value: CallbackTo[js.Array[Name]]): Self = StObject.set(x, "getConstraintNames", value.toJsFn)
      
      inline def setGetCrosscutsInfo(value: CallbackTo[CrosscutsInfo]): Self = StObject.set(x, "getCrosscutsInfo", value.toJsFn)
      
      inline def setGetEditableAttribute(value: Name => OutAttr): Self = StObject.set(x, "getEditableAttribute", js.Any.fromFunction1(value))
      
      inline def setGetEditableMemberAttribute(value: (SetId, MemberId, Name) => OutAttr): Self = StObject.set(x, "getEditableMemberAttribute", js.Any.fromFunction3(value))
      
      inline def setGetEditableMemberRegistry(value: (SetId, MemberId, Name) => Registry): Self = StObject.set(x, "getEditableMemberRegistry", js.Any.fromFunction3(value))
      
      inline def setGetEditableRegistry(value: Name => Registry): Self = StObject.set(x, "getEditableRegistry", js.Any.fromFunction1(value))
      
      inline def setGetFullyQualifiedName(value: CallbackTo[Name]): Self = StObject.set(x, "getFullyQualifiedName", value.toJsFn)
      
      inline def setGetGuid(value: CallbackTo[GUID]): Self = StObject.set(x, "getGuid", value.toJsFn)
      
      inline def setGetId(value: CallbackTo[NodeId]): Self = StObject.set(x, "getId", value.toJsFn)
      
      inline def setGetInheritorIds(value: CallbackTo[js.Array[NodeId]]): Self = StObject.set(x, "getInheritorIds", value.toJsFn)
      
      inline def setGetInstancePaths(value: CallbackTo[js.Array[Path]]): Self = StObject.set(x, "getInstancePaths", value.toJsFn)
      
      inline def setGetJsonMeta(value: CallbackTo[js.Array[Metadata]]): Self = StObject.set(x, "getJsonMeta", value.toJsFn)
      
      inline def setGetLibraryGuid(value: CallbackTo[GUID]): Self = StObject.set(x, "getLibraryGuid", value.toJsFn)
      
      inline def setGetMemberAttribute(value: (SetId, MemberId) => OutAttr): Self = StObject.set(x, "getMemberAttribute", js.Any.fromFunction2(value))
      
      inline def setGetMemberAttributeNames(value: (SetId, MemberId) => js.Array[Name]): Self = StObject.set(x, "getMemberAttributeNames", js.Any.fromFunction2(value))
      
      inline def setGetMemberIds(value: SetId => js.Array[Path]): Self = StObject.set(x, "getMemberIds", js.Any.fromFunction1(value))
      
      inline def setGetMemberRegistry(value: (SetId, MemberId, Name) => Registry): Self = StObject.set(x, "getMemberRegistry", js.Any.fromFunction3(value))
      
      inline def setGetMemberRegistryNames(value: (SetId, MemberId) => js.Array[Name]): Self = StObject.set(x, "getMemberRegistryNames", js.Any.fromFunction2(value))
      
      inline def setGetMetaTypeId(value: CallbackTo[Node | Null]): Self = StObject.set(x, "getMetaTypeId", value.toJsFn)
      
      inline def setGetMixinPaths(value: CallbackTo[js.Array[Path]]): Self = StObject.set(x, "getMixinPaths", value.toJsFn)
      
      inline def setGetNamespace(value: CallbackTo[Name]): Self = StObject.set(x, "getNamespace", value.toJsFn)
      
      inline def setGetNode(value: (NodeId, GmeLogger, Any, ResultCallback[Storage]) => Node): Self = StObject.set(x, "getNode", js.Any.fromFunction4(value))
      
      inline def setGetOwnAttribute(value: Name => OutAttr): Self = StObject.set(x, "getOwnAttribute", js.Any.fromFunction1(value))
      
      inline def setGetOwnAttributeNames(value: CallbackTo[js.Array[Name]]): Self = StObject.set(x, "getOwnAttributeNames", value.toJsFn)
      
      inline def setGetOwnConstraintNames(value: CallbackTo[js.Array[Name]]): Self = StObject.set(x, "getOwnConstraintNames", value.toJsFn)
      
      inline def setGetOwnEditableAttribute(value: Name => OutAttr): Self = StObject.set(x, "getOwnEditableAttribute", js.Any.fromFunction1(value))
      
      inline def setGetOwnEditableRegistry(value: Name => Registry): Self = StObject.set(x, "getOwnEditableRegistry", js.Any.fromFunction1(value))
      
      inline def setGetOwnPointer(value: Name => Pointer): Self = StObject.set(x, "getOwnPointer", js.Any.fromFunction1(value))
      
      inline def setGetOwnPointerId(value: Name => SetId): Self = StObject.set(x, "getOwnPointerId", js.Any.fromFunction1(value))
      
      inline def setGetOwnPointerNames(value: CallbackTo[js.Array[Name]]): Self = StObject.set(x, "getOwnPointerNames", value.toJsFn)
      
      inline def setGetOwnRegistry(value: Name => Registry): Self = StObject.set(x, "getOwnRegistry", js.Any.fromFunction1(value))
      
      inline def setGetOwnRegistryNames(value: CallbackTo[js.Array[Name]]): Self = StObject.set(x, "getOwnRegistryNames", value.toJsFn)
      
      inline def setGetOwnValidAspectNames(value: CallbackTo[js.Array[Name]]): Self = StObject.set(x, "getOwnValidAspectNames", value.toJsFn)
      
      inline def setGetOwnValidAttributeNames(value: CallbackTo[js.Array[Name]]): Self = StObject.set(x, "getOwnValidAttributeNames", value.toJsFn)
      
      inline def setGetParentId(value: CallbackTo[NodeId]): Self = StObject.set(x, "getParentId", value.toJsFn)
      
      inline def setGetPointer(value: Name => Pointer): Self = StObject.set(x, "getPointer", js.Any.fromFunction1(value))
      
      inline def setGetPointerId(value: Name => SetId): Self = StObject.set(x, "getPointerId", js.Any.fromFunction1(value))
      
      inline def setGetPointerNames(value: CallbackTo[js.Array[Name]]): Self = StObject.set(x, "getPointerNames", value.toJsFn)
      
      inline def setGetRegistry(value: Name => Registry): Self = StObject.set(x, "getRegistry", js.Any.fromFunction1(value))
      
      inline def setGetRegistryNames(value: CallbackTo[js.Array[Name]]): Self = StObject.set(x, "getRegistryNames", value.toJsFn)
      
      inline def setGetRelid(value: CallbackTo[RelId]): Self = StObject.set(x, "getRelid", value.toJsFn)
      
      inline def setGetSetNames(value: CallbackTo[js.Array[Name]]): Self = StObject.set(x, "getSetNames", value.toJsFn)
      
      inline def setGetValidAspectNames(value: CallbackTo[js.Array[Name]]): Self = StObject.set(x, "getValidAspectNames", value.toJsFn)
      
      inline def setGetValidAttributeNames(value: CallbackTo[js.Array[Name]]): Self = StObject.set(x, "getValidAttributeNames", value.toJsFn)
      
      inline def setGetValidChildrenIds(value: CallbackTo[js.Array[NodeId]]): Self = StObject.set(x, "getValidChildrenIds", value.toJsFn)
      
      inline def setGetValidChildrenTypes(value: CallbackTo[js.Array[NodeId]]): Self = StObject.set(x, "getValidChildrenTypes", value.toJsFn)
      
      inline def setGetValidChildrenTypesDetailed(value: (Aspect, Boolean) => Dictionary[Any]): Self = StObject.set(x, "getValidChildrenTypesDetailed", js.Any.fromFunction2(value))
      
      inline def setGetValidPointerNames(value: CallbackTo[js.Array[Name]]): Self = StObject.set(x, "getValidPointerNames", value.toJsFn)
      
      inline def setGetValidSetMemberTypesDetailed(value: Name => StringDictionary[Any]): Self = StObject.set(x, "getValidSetMemberTypesDetailed", js.Any.fromFunction1(value))
      
      inline def setGetValidSetNames(value: CallbackTo[js.Array[Name]]): Self = StObject.set(x, "getValidSetNames", value.toJsFn)
      
      inline def setGetValildAttributeNames(value: CallbackTo[js.Array[Name]]): Self = StObject.set(x, "getValildAttributeNames", value.toJsFn)
      
      inline def setIsAbstract(value: CallbackTo[Boolean]): Self = StObject.set(x, "isAbstract", value.toJsFn)
      
      inline def setIsConnection(value: CallbackTo[Boolean]): Self = StObject.set(x, "isConnection", value.toJsFn)
      
      inline def setIsLibraryElement(value: CallbackTo[Boolean]): Self = StObject.set(x, "isLibraryElement", value.toJsFn)
      
      inline def setIsLibraryRoot(value: CallbackTo[Boolean]): Self = StObject.set(x, "isLibraryRoot", value.toJsFn)
      
      inline def setIsMetaNode(value: CallbackTo[Boolean]): Self = StObject.set(x, "isMetaNode", value.toJsFn)
      
      inline def setIsReadOnly(value: CallbackTo[Boolean]): Self = StObject.set(x, "isReadOnly", value.toJsFn)
      
      inline def setIsTypeOf(value: Path => Boolean): Self = StObject.set(x, "isTypeOf", js.Any.fromFunction1(value))
      
      inline def setIsValidAttributeValueOf(value: (Name, Any) => Boolean): Self = StObject.set(x, "isValidAttributeValueOf", js.Any.fromFunction2(value))
      
      inline def setIsValidChildOf(value: Path => Boolean): Self = StObject.set(x, "isValidChildOf", js.Any.fromFunction1(value))
      
      inline def setIsValidNewBase(value: Path => Boolean): Self = StObject.set(x, "isValidNewBase", js.Any.fromFunction1(value))
      
      inline def setIsValidNewParent(value: Path => Boolean): Self = StObject.set(x, "isValidNewParent", js.Any.fromFunction1(value))
      
      inline def setIsValidTargetOf(value: (Path, Name) => Boolean): Self = StObject.set(x, "isValidTargetOf", js.Any.fromFunction2(value))
      
      inline def set_id(value: String): Self = StObject.set(x, "_id", value.asInstanceOf[js.Any])
    }
  }
  
  type ObjectHash = String
  
  trait RelationRule
    extends StObject
       with RelationRuleDetail
       with RelationRuleDictionary
  object RelationRule {
    
    inline def apply(): RelationRule = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RelationRule]
    }
  }
  
  trait RelationRuleDetail extends StObject {
    
    /** 
      * The maximum amount of target necessary for the relationship 
      * (if not present or '-1' then there is no maximum rule that applies) 
      */
    var max: js.UndefOr[Double] = js.undefined
    
    /** 
      * The minimum amount of target necessary for the relationship 
      * (if not present or '-1' then there is no minimum rule that applies) 
      */
    var min: js.UndefOr[Double] = js.undefined
  }
  object RelationRuleDetail {
    
    inline def apply(): RelationRuleDetail = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RelationRuleDetail]
    }
    
    extension [Self <: RelationRuleDetail](x: Self) {
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    }
  }
  
  type RelationRuleDictionary = StringDictionary[RelationRuleDetail]
}
