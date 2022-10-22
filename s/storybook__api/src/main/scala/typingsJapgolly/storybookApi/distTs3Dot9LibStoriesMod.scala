package typingsJapgolly.storybookApi

import japgolly.scalajs.react.facade.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.std.Parameters
import typingsJapgolly.std.Record
import typingsJapgolly.storybookApi.anon.DictparameterName
import typingsJapgolly.storybookApi.anon.DocsOnly
import typingsJapgolly.storybookApi.anon.Error
import typingsJapgolly.storybookApi.anon.Prepared
import typingsJapgolly.storybookApi.anon.Provider
import typingsJapgolly.storybookApi.anon.Stories
import typingsJapgolly.storybookApi.storybookApiBooleans.`false`
import typingsJapgolly.storybookApi.storybookApiBooleans.`true`
import typingsJapgolly.storybookApi.storybookApiInts.`0`
import typingsJapgolly.storybookApi.storybookApiStrings.component
import typingsJapgolly.storybookApi.storybookApiStrings.docs
import typingsJapgolly.storybookApi.storybookApiStrings.group
import typingsJapgolly.storybookApi.storybookApiStrings.root
import typingsJapgolly.storybookApi.storybookApiStrings.story
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTs3Dot9LibStoriesMod {
  
  @JSImport("@storybook/api/dist/ts3.9/lib/stories", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def denormalizeStoryParameters(hasGlobalParametersKindParametersStories: SetStoriesPayload): StoriesRaw = ^.asInstanceOf[js.Dynamic].applyDynamic("denormalizeStoryParameters")(hasGlobalParametersKindParametersStories.asInstanceOf[js.Any]).asInstanceOf[StoriesRaw]
  
  inline def getComponentLookupList(hash: StoriesHash): js.Array[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getComponentLookupList")(hash.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Array[String]]]
  
  inline def getStoriesLookupList(hash: StoriesHash): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getStoriesLookupList")(hash.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def isGroup(item: Item): /* is @storybook/api.@storybook/api/dist/ts3.9/lib/stories.Group */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isGroup")(item.asInstanceOf[js.Any]).asInstanceOf[/* is @storybook/api.@storybook/api/dist/ts3.9/lib/stories.Group */ Boolean]
  
  inline def isRoot(item: Item): /* is @storybook/api.@storybook/api/dist/ts3.9/lib/stories.Root */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRoot")(item.asInstanceOf[js.Any]).asInstanceOf[/* is @storybook/api.@storybook/api/dist/ts3.9/lib/stories.Root */ Boolean]
  
  inline def isStory(item: Item): /* is @storybook/api.@storybook/api/dist/ts3.9/lib/stories.Story */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isStory")(item.asInstanceOf[js.Any]).asInstanceOf[/* is @storybook/api.@storybook/api/dist/ts3.9/lib/stories.Story */ Boolean]
  
  inline def transformStoriesRawToStoriesHash(input: StoriesRaw, hasProviderPrepared: Prepared): StoriesHash = (^.asInstanceOf[js.Dynamic].applyDynamic("transformStoriesRawToStoriesHash")(input.asInstanceOf[js.Any], hasProviderPrepared.asInstanceOf[js.Any])).asInstanceOf[StoriesHash]
  
  inline def transformStoryIndexToStoriesHash(index: StoryIndex, hasProvider: Provider): StoriesHash = (^.asInstanceOf[js.Dynamic].applyDynamic("transformStoryIndexToStoriesHash")(index.asInstanceOf[js.Any], hasProvider.asInstanceOf[js.Any])).asInstanceOf[StoriesHash]
  
  trait Group extends StObject {
    
    var children: js.Array[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryId */ Any
      ]
    
    var depth: Double
    
    var id: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryId */ Any
    
    var isComponent: Boolean
    
    var isLeaf: `false`
    
    var isRoot: `false`
    
    var name: String
    
    var parameters: js.UndefOr[DocsOnly] = js.undefined
    
    var parent: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryId */ Any
      ] = js.undefined
    
    var refId: js.UndefOr[String] = js.undefined
    
    var renderLabel: js.UndefOr[js.Function1[/* item */ this.type, Node]] = js.undefined
    
    var `type`: group | component
  }
  object Group {
    
    inline def apply(
      children: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryId */ Any
        ],
      depth: Double,
      id: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryId */ Any,
      isComponent: Boolean,
      name: String,
      `type`: group | component
    ): Group = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isComponent = isComponent.asInstanceOf[js.Any], isLeaf = false, isRoot = false, name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Group]
    }
    
    extension [Self <: Group](x: Self) {
      
      inline def setChildren(
        value: js.Array[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryId */ Any
            ]
      ): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenVarargs(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryId */ Any)*
      ): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
      
      inline def setId(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryId */ Any
      ): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIsComponent(value: Boolean): Self = StObject.set(x, "isComponent", value.asInstanceOf[js.Any])
      
      inline def setIsLeaf(value: `false`): Self = StObject.set(x, "isLeaf", value.asInstanceOf[js.Any])
      
      inline def setIsRoot(value: `false`): Self = StObject.set(x, "isRoot", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setParameters(value: DocsOnly): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
      
      inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
      
      inline def setParent(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryId */ Any
      ): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
      
      inline def setRefId(value: String): Self = StObject.set(x, "refId", value.asInstanceOf[js.Any])
      
      inline def setRefIdUndefined: Self = StObject.set(x, "refId", js.undefined)
      
      inline def setRenderLabel(value: Group => Node): Self = StObject.set(x, "renderLabel", js.Any.fromFunction1(value))
      
      inline def setRenderLabelUndefined: Self = StObject.set(x, "renderLabel", js.undefined)
      
      inline def setType(value: group | component): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type GroupsList = js.Array[Root | Group]
  
  /* Inlined @storybook/api.@storybook/api/dist/ts3.9/lib/stories.StoriesHash[keyof @storybook/api.@storybook/api/dist/ts3.9/lib/stories.StoriesHash] */
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.storybookApi.storybookApiStrings.kind
    - typingsJapgolly.storybookApi.storybookApiStrings.children
    - typingsJapgolly.storybookApi.storybookApiStrings.refId
    - typingsJapgolly.storybookApi.storybookApiStrings.isComponent
    - typingsJapgolly.storybookApi.storybookApiStrings.depth
    - typingsJapgolly.storybookApi.storybookApiStrings.initialArgs
    - typingsJapgolly.storybookApi.storybookApiStrings.prepared
    - typingsJapgolly.storybookApi.storybookApiStrings.startCollapsed
    - typingsJapgolly.storybookApi.storybookApiStrings.argTypes
    - typingsJapgolly.storybookApi.storybookApiStrings.parent
    - typingsJapgolly.storybookApi.storybookApiStrings.isLeaf
    - typingsJapgolly.storybookApi.storybookApiStrings.renderLabel
    - typingsJapgolly.storybookApi.storybookApiStrings.args
    - typingsJapgolly.storybookApi.storybookApiStrings.`type`
    - typingsJapgolly.storybookApi.storybookApiStrings.parameters
    - typingsJapgolly.storybookApi.storybookApiStrings.name
    - typingsJapgolly.storybookApi.storybookApiStrings.id
    - typingsJapgolly.storybookApi.storybookApiStrings.isRoot
  */
  trait Item extends StObject
  object Item {
    
    inline def argTypes: typingsJapgolly.storybookApi.storybookApiStrings.argTypes = "argTypes".asInstanceOf[typingsJapgolly.storybookApi.storybookApiStrings.argTypes]
    
    inline def args: typingsJapgolly.storybookApi.storybookApiStrings.args = "args".asInstanceOf[typingsJapgolly.storybookApi.storybookApiStrings.args]
    
    inline def children: typingsJapgolly.storybookApi.storybookApiStrings.children = "children".asInstanceOf[typingsJapgolly.storybookApi.storybookApiStrings.children]
    
    inline def depth: typingsJapgolly.storybookApi.storybookApiStrings.depth = "depth".asInstanceOf[typingsJapgolly.storybookApi.storybookApiStrings.depth]
    
    inline def id: typingsJapgolly.storybookApi.storybookApiStrings.id = "id".asInstanceOf[typingsJapgolly.storybookApi.storybookApiStrings.id]
    
    inline def initialArgs: typingsJapgolly.storybookApi.storybookApiStrings.initialArgs = "initialArgs".asInstanceOf[typingsJapgolly.storybookApi.storybookApiStrings.initialArgs]
    
    inline def isComponent: typingsJapgolly.storybookApi.storybookApiStrings.isComponent = "isComponent".asInstanceOf[typingsJapgolly.storybookApi.storybookApiStrings.isComponent]
    
    inline def isLeaf: typingsJapgolly.storybookApi.storybookApiStrings.isLeaf = "isLeaf".asInstanceOf[typingsJapgolly.storybookApi.storybookApiStrings.isLeaf]
    
    inline def isRoot: typingsJapgolly.storybookApi.storybookApiStrings.isRoot = "isRoot".asInstanceOf[typingsJapgolly.storybookApi.storybookApiStrings.isRoot]
    
    inline def kind: typingsJapgolly.storybookApi.storybookApiStrings.kind = "kind".asInstanceOf[typingsJapgolly.storybookApi.storybookApiStrings.kind]
    
    inline def name: typingsJapgolly.storybookApi.storybookApiStrings.name = "name".asInstanceOf[typingsJapgolly.storybookApi.storybookApiStrings.name]
    
    inline def parameters: typingsJapgolly.storybookApi.storybookApiStrings.parameters = "parameters".asInstanceOf[typingsJapgolly.storybookApi.storybookApiStrings.parameters]
    
    inline def parent: typingsJapgolly.storybookApi.storybookApiStrings.parent = "parent".asInstanceOf[typingsJapgolly.storybookApi.storybookApiStrings.parent]
    
    inline def prepared: typingsJapgolly.storybookApi.storybookApiStrings.prepared = "prepared".asInstanceOf[typingsJapgolly.storybookApi.storybookApiStrings.prepared]
    
    inline def refId: typingsJapgolly.storybookApi.storybookApiStrings.refId = "refId".asInstanceOf[typingsJapgolly.storybookApi.storybookApiStrings.refId]
    
    inline def renderLabel: typingsJapgolly.storybookApi.storybookApiStrings.renderLabel = "renderLabel".asInstanceOf[typingsJapgolly.storybookApi.storybookApiStrings.renderLabel]
    
    inline def startCollapsed: typingsJapgolly.storybookApi.storybookApiStrings.startCollapsed = "startCollapsed".asInstanceOf[typingsJapgolly.storybookApi.storybookApiStrings.startCollapsed]
    
    inline def `type`: typingsJapgolly.storybookApi.storybookApiStrings.`type` = "type".asInstanceOf[typingsJapgolly.storybookApi.storybookApiStrings.`type`]
  }
  
  type Path = String
  
  trait Root extends StObject {
    
    var children: js.Array[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryId */ Any
      ]
    
    var depth: `0`
    
    var id: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryId */ Any
    
    var isComponent: `false`
    
    var isLeaf: `false`
    
    var isRoot: `true`
    
    var name: String
    
    var refId: js.UndefOr[String] = js.undefined
    
    var renderLabel: js.UndefOr[js.Function1[/* item */ this.type, Node]] = js.undefined
    
    var startCollapsed: js.UndefOr[Boolean] = js.undefined
    
    var `type`: root
  }
  object Root {
    
    inline def apply(
      children: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryId */ Any
        ],
      id: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryId */ Any,
      name: String
    ): Root = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], depth = 0, id = id.asInstanceOf[js.Any], isComponent = false, isLeaf = false, isRoot = true, name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("root")
      __obj.asInstanceOf[Root]
    }
    
    extension [Self <: Root](x: Self) {
      
      inline def setChildren(
        value: js.Array[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryId */ Any
            ]
      ): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenVarargs(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryId */ Any)*
      ): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setDepth(value: `0`): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
      
      inline def setId(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryId */ Any
      ): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIsComponent(value: `false`): Self = StObject.set(x, "isComponent", value.asInstanceOf[js.Any])
      
      inline def setIsLeaf(value: `false`): Self = StObject.set(x, "isLeaf", value.asInstanceOf[js.Any])
      
      inline def setIsRoot(value: `true`): Self = StObject.set(x, "isRoot", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setRefId(value: String): Self = StObject.set(x, "refId", value.asInstanceOf[js.Any])
      
      inline def setRefIdUndefined: Self = StObject.set(x, "refId", js.undefined)
      
      inline def setRenderLabel(value: Root => Node): Self = StObject.set(x, "renderLabel", js.Any.fromFunction1(value))
      
      inline def setRenderLabelUndefined: Self = StObject.set(x, "renderLabel", js.undefined)
      
      inline def setStartCollapsed(value: Boolean): Self = StObject.set(x, "startCollapsed", value.asInstanceOf[js.Any])
      
      inline def setStartCollapsedUndefined: Self = StObject.set(x, "startCollapsed", js.undefined)
      
      inline def setType(value: root): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type SetStoriesPayload = Error | (Stories & (Record[String, scala.Nothing]))
  
  type StoriesHash = StringDictionary[Root | Group | Story]
  
  type StoriesList = js.Array[Group | Story]
  
  type StoriesRaw = StringDictionary[StoryInput]
  
  trait Story extends StObject {
    
    var argTypes: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ArgTypes */ Any
      ] = js.undefined
    
    var args: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Args */ Any
      ] = js.undefined
    
    var children: js.UndefOr[
        js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryId */ Any
        ]
      ] = js.undefined
    
    var depth: Double
    
    var id: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryId */ Any
    
    var initialArgs: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Args */ Any
      ] = js.undefined
    
    var isComponent: Boolean
    
    var isLeaf: `true`
    
    var isRoot: `false`
    
    var kind: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryKind */ Any
    
    var name: String
    
    var parameters: js.UndefOr[DictparameterName] = js.undefined
    
    var parent: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryId */ Any
    
    var prepared: Boolean
    
    var refId: js.UndefOr[String] = js.undefined
    
    var renderLabel: js.UndefOr[js.Function1[/* item */ this.type, Node]] = js.undefined
    
    var `type`: story | docs
  }
  object Story {
    
    inline def apply(
      depth: Double,
      id: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryId */ Any,
      isComponent: Boolean,
      kind: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryKind */ Any,
      name: String,
      parent: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryId */ Any,
      prepared: Boolean,
      `type`: story | docs
    ): Story = {
      val __obj = js.Dynamic.literal(depth = depth.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isComponent = isComponent.asInstanceOf[js.Any], isLeaf = true, isRoot = false, kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], prepared = prepared.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Story]
    }
    
    extension [Self <: Story](x: Self) {
      
      inline def setArgTypes(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ArgTypes */ Any
      ): Self = StObject.set(x, "argTypes", value.asInstanceOf[js.Any])
      
      inline def setArgTypesUndefined: Self = StObject.set(x, "argTypes", js.undefined)
      
      inline def setArgs(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Args */ Any
      ): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
      
      inline def setChildren(
        value: js.Array[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryId */ Any
            ]
      ): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryId */ Any)*
      ): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
      
      inline def setId(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryId */ Any
      ): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setInitialArgs(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Args */ Any
      ): Self = StObject.set(x, "initialArgs", value.asInstanceOf[js.Any])
      
      inline def setInitialArgsUndefined: Self = StObject.set(x, "initialArgs", js.undefined)
      
      inline def setIsComponent(value: Boolean): Self = StObject.set(x, "isComponent", value.asInstanceOf[js.Any])
      
      inline def setIsLeaf(value: `true`): Self = StObject.set(x, "isLeaf", value.asInstanceOf[js.Any])
      
      inline def setIsRoot(value: `false`): Self = StObject.set(x, "isRoot", value.asInstanceOf[js.Any])
      
      inline def setKind(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryKind */ Any
      ): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setParameters(value: DictparameterName): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
      
      inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
      
      inline def setParent(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryId */ Any
      ): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setPrepared(value: Boolean): Self = StObject.set(x, "prepared", value.asInstanceOf[js.Any])
      
      inline def setRefId(value: String): Self = StObject.set(x, "refId", value.asInstanceOf[js.Any])
      
      inline def setRefIdUndefined: Self = StObject.set(x, "refId", js.undefined)
      
      inline def setRenderLabel(value: Story => Node): Self = StObject.set(x, "renderLabel", js.Any.fromFunction1(value))
      
      inline def setRenderLabelUndefined: Self = StObject.set(x, "renderLabel", js.undefined)
      
      inline def setType(value: story | docs): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait StoryIndex extends StObject {
    
    var stories: Record[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryId */ Any, 
        StoryIndexStory
      ]
    
    var v: Double
  }
  object StoryIndex {
    
    inline def apply(
      stories: Record[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryId */ Any, 
          StoryIndexStory
        ],
      v: Double
    ): StoryIndex = {
      val __obj = js.Dynamic.literal(stories = stories.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
      __obj.asInstanceOf[StoryIndex]
    }
    
    extension [Self <: StoryIndex](x: Self) {
      
      inline def setStories(
        value: Record[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryId */ Any, 
              StoryIndexStory
            ]
      ): Self = StObject.set(x, "stories", value.asInstanceOf[js.Any])
      
      inline def setV(value: Double): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
    }
  }
  
  trait StoryIndexStory extends StObject {
    
    var id: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryId */ Any
    
    var importPath: Path
    
    var name: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryName */ Any
    
    var parameters: js.UndefOr[Parameters[js.Function1[/* args */ Any, Any]]] = js.undefined
    
    var title: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentTitle */ Any
  }
  object StoryIndexStory {
    
    inline def apply(
      id: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryId */ Any,
      importPath: Path,
      name: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryName */ Any,
      title: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentTitle */ Any
    ): StoryIndexStory = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], importPath = importPath.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[StoryIndexStory]
    }
    
    extension [Self <: StoryIndexStory](x: Self) {
      
      inline def setId(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryId */ Any
      ): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setImportPath(value: Path): Self = StObject.set(x, "importPath", value.asInstanceOf[js.Any])
      
      inline def setName(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryName */ Any
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setParameters(value: Parameters[js.Function1[/* args */ Any, Any]]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
      
      inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
      
      inline def setTitle(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentTitle */ Any
      ): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  trait StoryInput extends StObject {
    
    var args: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Args */ Any
      ] = js.undefined
    
    var id: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryId */ Any
    
    var initialArgs: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Args */ Any
      ] = js.undefined
    
    var kind: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryKind */ Any
    
    var name: String
    
    var parameters: DictparameterName
    
    var refId: js.UndefOr[String] = js.undefined
  }
  object StoryInput {
    
    inline def apply(
      id: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryId */ Any,
      kind: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryKind */ Any,
      name: String,
      parameters: DictparameterName
    ): StoryInput = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any])
      __obj.asInstanceOf[StoryInput]
    }
    
    extension [Self <: StoryInput](x: Self) {
      
      inline def setArgs(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Args */ Any
      ): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
      
      inline def setId(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryId */ Any
      ): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setInitialArgs(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Args */ Any
      ): Self = StObject.set(x, "initialArgs", value.asInstanceOf[js.Any])
      
      inline def setInitialArgsUndefined: Self = StObject.set(x, "initialArgs", js.undefined)
      
      inline def setKind(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryKind */ Any
      ): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setParameters(value: DictparameterName): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
      
      inline def setRefId(value: String): Self = StObject.set(x, "refId", value.asInstanceOf[js.Any])
      
      inline def setRefIdUndefined: Self = StObject.set(x, "refId", js.undefined)
    }
  }
}
