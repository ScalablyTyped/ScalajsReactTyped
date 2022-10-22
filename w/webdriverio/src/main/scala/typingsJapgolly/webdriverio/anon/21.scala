package typingsJapgolly.webdriverio.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.std.NonNullable
import typingsJapgolly.wdioTypes.anon.OmitTestrunnercapabilitieAfter
import typingsJapgolly.wdioTypes.buildCapabilitiesMod.RemoteCapability
import typingsJapgolly.webdriverio.webdriverioStrings.`object`
import typingsJapgolly.webdriverio.webdriverioStrings.boolean
import typingsJapgolly.webdriverio.webdriverioStrings.function
import typingsJapgolly.webdriverio.webdriverioStrings.number
import typingsJapgolly.webdriverio.webdriverioStrings.string
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `21` extends StObject {
  
  var default: js.UndefOr[
    (js.Function4[
      /* config */ OmitTestrunnercapabilitieAfter, 
      /* capabilities */ RemoteCapability, 
      /* specs */ js.Array[String], 
      /* cid */ String, 
      Unit
    ]) | (js.Array[
      NonNullable[
        js.UndefOr[
          js.Function4[
            /* config */ OmitTestrunnercapabilitieAfter, 
            /* capabilities */ RemoteCapability, 
            /* specs */ js.Array[String], 
            /* cid */ String, 
            Unit
          ]
        ]
      ]
    ])
  ] = js.undefined
  
  var `match`: js.UndefOr[js.RegExp] = js.undefined
  
  var required: js.UndefOr[Boolean] = js.undefined
  
  var `type`: string | number | `object` | boolean | function
  
  var validate: js.UndefOr[
    js.Function1[
      /* option */ js.UndefOr[
        (js.Function4[
          /* config */ OmitTestrunnercapabilitieAfter, 
          /* capabilities */ RemoteCapability, 
          /* specs */ js.Array[String], 
          /* cid */ String, 
          Unit
        ]) | (js.Array[
          NonNullable[
            js.UndefOr[
              js.Function4[
                /* config */ OmitTestrunnercapabilitieAfter, 
                /* capabilities */ RemoteCapability, 
                /* specs */ js.Array[String], 
                /* cid */ String, 
                Unit
              ]
            ]
          ]
        ])
      ], 
      Unit
    ]
  ] = js.undefined
}
object `21` {
  
  inline def apply(`type`: string | number | `object` | boolean | function): `21` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`21`]
  }
  
  extension [Self <: `21`](x: Self) {
    
    inline def setDefault(
      value: (js.Function4[
          /* config */ OmitTestrunnercapabilitieAfter, 
          /* capabilities */ RemoteCapability, 
          /* specs */ js.Array[String], 
          /* cid */ String, 
          Unit
        ]) | (js.Array[
          NonNullable[
            js.UndefOr[
              js.Function4[
                /* config */ OmitTestrunnercapabilitieAfter, 
                /* capabilities */ RemoteCapability, 
                /* specs */ js.Array[String], 
                /* cid */ String, 
                Unit
              ]
            ]
          ]
        ])
    ): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDefaultFunction4(
      value: (/* config */ OmitTestrunnercapabilitieAfter, /* capabilities */ RemoteCapability, /* specs */ js.Array[String], /* cid */ String) => Callback
    ): Self = StObject.set(x, "default", js.Any.fromFunction4((t0: /* config */ OmitTestrunnercapabilitieAfter, t1: /* capabilities */ RemoteCapability, t2: /* specs */ js.Array[String], t3: /* cid */ String) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    inline def setDefaultVarargs(
      value: (NonNullable[
          js.UndefOr[
            js.Function4[
              /* config */ OmitTestrunnercapabilitieAfter, 
              /* capabilities */ RemoteCapability, 
              /* specs */ js.Array[String], 
              /* cid */ String, 
              Unit
            ]
          ]
        ])*
    ): Self = StObject.set(x, "default", js.Array(value*))
    
    inline def setMatch(value: js.RegExp): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
    
    inline def setMatchUndefined: Self = StObject.set(x, "match", js.undefined)
    
    inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    inline def setType(value: string | number | `object` | boolean | function): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValidate(
      value: /* option */ js.UndefOr[
          (js.Function4[
            /* config */ OmitTestrunnercapabilitieAfter, 
            /* capabilities */ RemoteCapability, 
            /* specs */ js.Array[String], 
            /* cid */ String, 
            Unit
          ]) | (js.Array[
            NonNullable[
              js.UndefOr[
                js.Function4[
                  /* config */ OmitTestrunnercapabilitieAfter, 
                  /* capabilities */ RemoteCapability, 
                  /* specs */ js.Array[String], 
                  /* cid */ String, 
                  Unit
                ]
              ]
            ]
          ])
        ] => Callback
    ): Self = StObject.set(x, "validate", js.Any.fromFunction1((t0: /* option */ js.UndefOr[
          (js.Function4[
            /* config */ OmitTestrunnercapabilitieAfter, 
            /* capabilities */ RemoteCapability, 
            /* specs */ js.Array[String], 
            /* cid */ String, 
            Unit
          ]) | (js.Array[
            NonNullable[
              js.UndefOr[
                js.Function4[
                  /* config */ OmitTestrunnercapabilitieAfter, 
                  /* capabilities */ RemoteCapability, 
                  /* specs */ js.Array[String], 
                  /* cid */ String, 
                  Unit
                ]
              ]
            ]
          ])
        ]) => value(t0).runNow()))
    
    inline def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
  }
}
